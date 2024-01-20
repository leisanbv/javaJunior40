package msc.lesson9.blackJack;

import java.util.Scanner;

public class Game {
    private Dealer dealer = new Dealer();
    private Scanner sc = new Scanner(System.in);
    private Player[] players = new Player[4];
    private Coloda coloda = new Coloda();


    public Game() {
    }
    public Game(Dealer dealer) {
        this.dealer = dealer;
    }
    public void initializeGame() {
        String names;
        System.out.println("Welcome to the game!");

        System.out.println("What's your name?");
        names = sc.next();

        System.out.println("Player " + names);
        addPlayer(names);
        while(Player.morePlayers()){
            System.out.println("What's your name?");
            names = sc.next();
            System.out.println("Player " + names);
            addPlayer(names);
        }
    }

    //

    public void addPlayer(String name) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = new Player(name);
                return;
            }
        }
    }


    //написать метод который будет добавлять игрока в игру (через  цикл for)


    public void distributeCard() {
        dealer.addCart(coloda.getRandomCard());
        dealer.addCart(coloda.getRandomCard());

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                players[i].addCart(coloda.getRandomCard());
                players[i].addCart(coloda.getRandomCard());
            }
        }
    }

    public void distributeMoreCards() {
        while (dealer.moreCards()) {
            dealer.addCart(coloda.getRandomCard());
        }
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                while (players[i].moreCards()) {
                    players[i].addCart((coloda.getRandomCard()));
                }
            }
        }
    }

    public void printWinner() {
        boolean win21 = false;

        if (dealer.returnScore() == 21) {
            dealer.setWin(true);
            win21 = true;
        }
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                if (players[i].returnScore() == 21) {
                    win21 = true;
                    players[i].setWin(true);
                }
            }
        }


        if (win21) {
            printWinPlayers();
            return;
        }
        int maxValue = 0;
        if (dealer.returnScore() <= 21) {
            maxValue = dealer.returnScore();
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) { // проверяем не пустой ли игрок
                if (players[i].returnScore() <= 21) {
                    if (maxValue < players[i].returnScore()) {
                        maxValue = players[i].returnScore(); // значение < текущего игрока
                    }
                }

            }
        }
        if (maxValue == 0) {
            dealer.setWin(true);
            printWinPlayers();
            return;
        }
        if (dealer.returnScore() == maxValue) {
            dealer.setWin(true);
        }
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                if (players[i].returnScore() == maxValue)
                    players[i].setWin(true);
            }
        }
        printWinPlayers();
    }



    public void printWinPlayers() {
        if (dealer.isWin()) {
            System.out.println(dealer.toString());
        }

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                if (players[i].isWin()) {
                    System.out.println(players[i]);
                }
            }
        }
    }


}

