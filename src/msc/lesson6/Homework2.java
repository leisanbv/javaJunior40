package msc.lesson6;

public class Homework2 {
    public static void main(String[] args) {
        String psw = " qwe123121 ";
        for (char c : psw.toCharArray()) {
            // colon (: or in) - for-each loop
            if (Character.isWhitespace(c)) {
                System.out.println("The password should not include @'s");
                return;
            } else {
                System.out.println("This is a valid password");
                return;
            }
            // length  у массива без скобок, у ссылочного типа со скобками

        }
    }
}
