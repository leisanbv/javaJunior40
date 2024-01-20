package msc.lesson8;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("A program for perimeter and square calculation");
        System.out.println("Какую фигуру нужно рассчитать?");
        System.out.println("1 - triangle");
        System.out.println("2 - circle");
        System.out.println("3 - rectangle");
        System.out.println("4 - parallelepiped");
        System.out.println("5 - oval");

        System.out.println();
        // Scanner class
        //System - клавиатура
        //Out - keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number: ");
        int numFigure = sc.nextInt();
        //switch case / else if
        switch (numFigure) {
            case 1:
                Triangle tr = new Triangle();
                System.out.println("Enter A");
                // нужно поймать введенную пользователем цифру
                int a = sc.nextInt();
                tr.setA(a);

                System.out.println("Enter B");
                int b = sc.nextInt();
                tr.setB(b);

                System.out.println("Enter C");
                int c = sc.nextInt();
                tr.setC(c);
                System.out.println("The perimeter is " + tr.perimeter());
                System.out.println("The area is " + tr.area());

                break;

            case 2:

                Circle k = new Circle();
                System.out.println("Enter a radius");
                int r = sc.nextInt();
                k.setRadius(r);
                System.out.println("The perimeter = " + k.perimeter());
                System.out.println("The area = " + k.area());
                break;

            case 3:
                Rectangle rect = new Rectangle();
                System.out.println("Enter a length: ");
                int lg = sc.nextInt();
                System.out.println("Enter a width: ");
                int wd = sc.nextInt();
                rect.setLength(lg);
                rect.setWidth(wd);
                System.out.println("The perimeter = " + rect.perimeter());
                System.out.println("The area = " + rect.square());
                break;

            case 4:
                Parallelepiped pd = new Parallelepiped();
                System.out.println("Enter a length of pd: ");
                int lgth = sc.nextInt();
                System.out.println("Enter a width of pd: ");
                int wdth = sc.nextInt();
                System.out.println("Enter a height of pd: ");
                int hggt = sc.nextInt();
                pd.setLengthOfParallelepiped(lgth);
                pd.setWidthOfParallelepiped(wdth);
                pd.setHeightOfParallelepiped(hggt);
                System.out.println("The perimeter of pd is " + pd.perimeter());
                System.out.println("The area of pd is " + pd.area());
                break;

            case 5:
                Oval ol = new Oval();
                System.out.println("Enter the first value: ");
                int first = sc.nextInt();
                System.out.println("Enter the second value: ");
                int second = sc.nextInt();
                ol.setFirst(first);
                ol.setSecond(second);
                System.out.println("The perimeter equals to " + ol.perimeter());
                System.out.println("The area equals to " + ol.area());

                break;

            default:
                System.out.println("Something's wrong");
        }
    }
}
