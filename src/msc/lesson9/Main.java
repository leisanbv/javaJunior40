package msc.lesson9;

public class Main {
    public static void main(String[] args) {
        //People hm = new People();

        People human = new People("Vasya",1, "musculine"); //Constructor
        human.setAge(1);
        human.setName("Vasya");
        human.setGender("feminine");

        // null- пустота, пустой объект в java
        /* когда создаем новый объект с таким же именем переменной, предыдущий объект обнуляется
        и создается объект с новыми переменными
         */

    }
}
