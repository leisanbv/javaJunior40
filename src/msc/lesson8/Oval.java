package msc.lesson8;

public class Oval {
    private int first;
    private int second;

    public void setFirst(int first) {
        if(first>0){
            this.first = first;
        }
    }

    public int getFirst() {
        return this.first;
    }

    public void setSecond(int second) {
        if(second>0){
            this.second = second;
        }
    }

    public int getSecond() {
        return this.second;
    }

    public static double pow (double value, int power){
        return Math.pow(value, power);
    }
    public double perimeter() {
        return 2*Math.PI*Math.sqrt(pow(first,2)+pow(second,2)/2);
    }
    public double area(){
        return Math.PI*first*second;
    }

}
