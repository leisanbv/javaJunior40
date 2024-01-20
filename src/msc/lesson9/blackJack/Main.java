package msc.lesson9.blackJack;

public class Main {
    public static void main(String[] args) {
        //Coloda c = new Coloda();
        //System.out.println();
        //System.out.println(c.getRandomCard());
        //Dealer d = new Dealer("Man");
        Game game = new Game(new Dealer("Human"));
        game.initializeGame();

        //while(game.more)

        game.distributeCard();

        game.distributeMoreCards();

        game.printWinner();

        System.out.println("The end");



    }
}
