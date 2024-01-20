package msc.lesson6;

public class Homework1 {
    public static void main(String[] args) {
        //первый символ и последний не может быть пробелом
        String psw = "qwe123121 ";
        if (psw.contains(" ")) {
            System.out.println("The password should not include @'s");
        } else {
            System.out.println("This is a valid password");

//        //if(psw.trim().length()>0){
//            System.out.println("The password should not include @'s");
//        } else {
//            System.out.println("This is a valid password");

            // solution1
            String par = " dfgdff@ ";
            char c[] = par.toCharArray();
            if (c[0] == ' ' || c [c.length-1] == ' '){
                System.out.println("not accepted");
                return;
            }
            System.out.println("accepted");

            //solution2
//            String trim = par.trim();
//            if(!par.equals(trim())){
//                System.out.println("not accepted");
//                return;
//            }
//            System.out.println("accepted");

            //solution3
            String[] s = par.split(""); //массив стрингов
            for(int i=0; i<s.length;i++){
                System.out.println();

            }
        }
    }
}
