package msc.lesson6;


public class Homework {
    public static void main(String[] args) {


        //в пароле не должно быть @
        // 1 var
        String password = "qwe123121";
        int value = password.indexOf("@");
        if (value > -1) {
            System.out.println("The password should not include @'s");
        } else {
            System.out.println("This is a valid password");
        }

        // 2 var

/*        boolean vl = password.contains("@");
        if (vl.contains("@")) {
            System.out.println("The password should not include @'s");
        } else {
            System.out.println("This is a valid password");*/

//        boolean vl = password.contains("@");
//        System.out.println(vl);
//        if (vl==true){
//            System.out.println("The password should not include @'s");
//        } else {
//            System.out.println("This is a valid password");
//        }
//
        // lesson 1 option
//        String[] split = par.split("@");
//        if(split.length>1){
//            System.out.println("Dfdfd");
//            return;
//
    }
}
//        // lesson 2 option
//        String replace = par.replace("@", " ! ");
//        if(!replace.equals(par)){


