package msc.lesson9.blackJack;

import java.util.Scanner;

public class Player {
    private String name;
    private Card[] cards = new Card[10];
    private boolean win = false;


    public void setWin(boolean win){
        this.win = win;
    }

    public boolean isWin() {
        return win;
    }

    public Player() {
    }

    public Player (String name){
        this.name=name;
    }
    public void setName(String name){
        this.name = name;

    }
    public String getName (String name){
        return this.name;
    }

    public void addCart(Card card) {
        // cards [0] = card;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                return; // ретурн нужен чтобы значения не повторялись, то есть как нашел значение в цикле, выходи
            }
        }
    }

    public void printCard() {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                System.out.println(cards[i].getName() + cards[i].getValue() + " очков");
            }

        }
    }
    // написать метод который будет возвращать колво очков по картам
//    public static int returnScore(int [] hand, int reveal){
//        int score = 0;
//        boolean hasAce = false;
//        for(int i=0; i<reveal;i++){
//            switch (hand[i]%13){
//                case 0: score+=11; hasAce = true; break;
//                case 1: score+=2; break;
//                case 2: score+=3; break;
//                case 3: score+=4; break;
//                case 4: score+=5; break;
//                case 5: score+=6; break;
//                case 6: score+=7; break;
//                case 7: score+=8; break;
//                case 8: score+=9; break;
//                case 9: score+=10; break;
//                case 10: score+=10; break;
//                case 11: score+=10; break;
//                case 12: score+=10; break;
//            }
//        }
//        if (score>21 && hasAce){
//            score-=10;
//        }
//        return score;
    public int returnScore(){
        int result = 0;
        for(int i =0; i< cards.length;i++){
            if(cards[i]!=null) {
                result = result + cards[i].getValue();
            }
        }
        return result;
    }

    public boolean moreCards(){
        System.out.println("Player " + name);
        printCard();
        System.out.println("The total is: " + returnScore());
        System.out.println("More cards? ");
        System.out.println("1 - Yes, 2 - No");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1){
            return true;
        }
        return false;
    }


    public static boolean morePlayers(){
        // в game
//        int count=0;
//        for(int i=0;i<players.length;i++){
//            if(players[i]!=null){
//                count++;
//            }
//        }
//        if (count==players.length){
//            System.out.println("достигнуто макс число игроков");
//            return false;
//        }
        System.out.println("More players?");
        System.out.println("1 - yes, 2 - no");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c==1){
            return true;

        }
        return false;
    }
}