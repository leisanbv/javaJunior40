package msc.lesson8;

public class Circle {
    private int radius;


    public int getRadius(){
        return radius;
    }


    public void setRadius(int Radius){
        this.radius = radius;

    }

    public double perimeter(){
        return 2 * radius * Math.PI;
    }

    public double area(){
        return radius*radius*Math.PI;
    }


}
