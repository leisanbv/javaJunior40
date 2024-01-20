package msc.lesson6;

import java.util.Date;

public class Types {
    public static void main(String[] args) {
        int i=378;
        String s="hi world";
        String s2="hi world";
        //Human h = new Human(); // Human - is an object
        //String said = c.yourName(); // my name is (inside say)

        int length = s.length();
        System.out.println(length);


        String s1= s.toUpperCase();
        System.out.println(s1);

        char c = s.charAt(7);
        System.out.println(c);

        boolean equals = s.equals(123);
        System.out.println(equals);

        //Char [chars] = s.toCharArray[];
        //for (int i =0; i<chars.length; i++){
          // System.out.println(chars[i]);}

        System.out.println(s.describeConstable());

        Date d = new Date();
        String s3= d.toString();
        System.out.println(s3);

        System.out.println(d.getTime());

    }
}
