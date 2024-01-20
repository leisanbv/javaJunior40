package msc.lesson7;

public class Main {
    public static void main(String[] args) {
        String s = "gfddfff"; // s - тип стринг
        Operation oper = new Operation(); // object
        String a = oper.getUpperText(s);

        System.out.println(a);

        int sum = oper.sum(23,34);
        System.out.println(sum);

        oper.printText("GFDFSDF");

        Operation.multiply(3,6);
        // общий тип

//        int dv = oper.divide(7,3);
//        System.out.println(dv);


    }
}
