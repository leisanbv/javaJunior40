package msc.lesson4;

public class Main {
    public static void main(String[] args) {
        //
        int[]a123={1,2,3}; //3
        int[]b4567={4,5,6,7}; //4
        //int[]c1234567 ={1,2,3,4,5,6,7};
        int[]c1234567 = new int[a123.length+b4567.length]; //7
        for(int i=0;i<c1234567.length;i++){
            if(i<a123.length) {
                c1234567[i]=a123[i];
            }else {
                //i=3
                c1234567[i] = b4567[i - a123.length];
            }
            System.out.println(c1234567[i]);
        }
        c1234567[0]=a123[0];
        c1234567[1]=a123[1];
        c1234567[2]=a123[2];

        c1234567[3]=b4567[0];
        c1234567[4]=b4567[1];
        c1234567[5]=b4567[2];
        c1234567[6]=b4567[3];

    }
}
