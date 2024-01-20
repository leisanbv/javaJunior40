package msc.lesson9.blackJack;

import java.util.Random;

public class Coloda {
    private Card[] kol;

    public Coloda() {
        kol = new Card[]
                {
                        new Card("2 Черви", 2),
                        new Card("2 Буби", 2),
                        new Card("2 Пики", 2),
                        new Card("2 Крести", 2),

                        new Card("3 Черви", 3),
                        new Card("3 Буби", 3),
                        new Card("3 Пики", 3),
                        new Card("3 Крести", 3),

                        new Card("4 Черви", 4),
                        new Card("4 Буби", 4),
                        new Card("4 Пики", 4),
                        new Card("4 Крести", 4),

                        new Card("5 Черви", 5),
                        new Card("5 Буби", 5),
                        new Card("5 Пики", 5),
                        new Card("5 Крести", 5),

                        new Card("6 Черви", 6),
                        new Card("6 Буби", 6),
                        new Card("6 Пики", 6),
                        new Card("6 Крести", 6),

                        new Card("7 Черви", 7),
                        new Card("7 Буби", 7),
                        new Card("7 Пики", 7),
                        new Card("7 Крести", 7),

                        new Card("8 Черви", 8),
                        new Card("8 Буби", 8),
                        new Card("8 Пики", 8),
                        new Card("8 Крести", 8),

                        new Card("9 Черви", 9),
                        new Card("9 Буби", 9),
                        new Card("9 Пики", 9),
                        new Card("9 Крести", 9),

                        new Card("10 Черви", 10),
                        new Card("10 Буби", 10),
                        new Card("10 Пики", 10),
                        new Card("10 Крести", 10),

                        new Card("Валет Черви", 10),
                        new Card("Валет Буби", 10),
                        new Card("Валет Пики", 10),
                        new Card("Валет Крести", 10),

                        new Card("Дама Черви", 10),
                        new Card("Дама Буби", 10),
                        new Card("Дама Пики", 10),
                        new Card("Дама Крести", 10),

                        new Card("Король Черви", 10),
                        new Card("Король Буби", 10),
                        new Card("Король Пики", 10),
                        new Card("Король Крести", 10),

                        new Card("Туз Черви", 11),
                        new Card("Туз Буби", 11),
                        new Card("Туз Пики", 11),
                        new Card("Туз Крести", 11)
                };


    }
    public Card getRandomCard(){
        Random r = new Random();
        //int i = r.nextInt(52); (0-51)
        //Cart cart = kol[i]; i - a random number of a card
        return kol[r.nextInt(52)];
    }


}