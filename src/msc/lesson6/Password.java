package msc.lesson6;

public class Password {
    public static void main(String[] args) {
        String password = "qwe123121";
        //password should have more than 8 symbols
        if (password.length() <=8){
            System.out.println("Password must have 8 symbols and more");
            return;
        }
        //String low = password.toLowerCase();
        //if (low.equals((password))) {
        //  System.out.println("Password must have 8 symbols and more")}

        //System.out.println("Password is accepted")}

        // must be at least one letter in Upper case
        //for(){
        //  if(el == "Q" || el == "W"){
        String alfaUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        boolean res = true;
        for (int i = 0; i < password.length(); i++) {
            if (alfaUpper.contains(password.charAt(i) + " ")) { //пробегается по всему паролю и проверяет, возвращая только один символ
                // contains - есть ли элемент в алфавите
                res = false;
                break;

            }
        }
        if (res) {
            System.out.println("Password must have 8 symbols and more");
            return;
        }
        System.out.println("Password is accepted");

        
    }
}