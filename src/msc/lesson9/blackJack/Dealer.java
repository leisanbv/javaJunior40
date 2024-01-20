package msc.lesson9.blackJack;

public class Dealer {
    private String name;
    private Card[] cards = new Card[10];
    private boolean win = false;

    public Dealer() {
    }

    public Dealer(String name) {
        this.name = name;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
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
                System.out.println(cards[i].getName() + " " + cards[i].getValue() + " очков");
            }

        }
    }
    // написать метод который будет возвращать колво очков по картам

    public int returnScore() {
        int result = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                result = result + cards[i].getValue();
            }

        } return result;
    }


    public boolean moreCards() {
        if (returnScore() < 17) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String res = " ";
        for (int i = 0; i < cards.length; i++) {
            res = res + cards[i];
        }
        return "Dealer " + name + " " + cards;
    }
}

