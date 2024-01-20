package msc.lesson13.errors;

public class Main3 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(160);
        } catch (AgeException e) {
            System.out.println("Age can't be more than 150");
        }
        System.out.println("Hey!");
    }

}
