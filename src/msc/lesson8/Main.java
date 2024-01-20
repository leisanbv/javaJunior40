package msc.lesson8;

public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        tr.setA(123);
        tr.setB(123);
        tr.setC(153);
        System.out.println(tr.getA());

        tr.perimeter();

        System.out.println(tr.getA()+tr.getB()+tr.getC());
        Triangle tr2 = new Triangle();
        //tr2.a = 325;
        //System.out.println(tr2.a);



    }
}
