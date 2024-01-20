package msc.lesson8;

public class Rectangle {
    private int length;
    private int width;

    public void setLength(int length) {
        if(length>0){
            this.length = length;
        }
    }

    public int getLength() {
        return this.length;
    }

    public void setWidth(int width) {
        if(width>0){
            this.width = width;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public double perimeter(){
        return (length+width)*2;
    }

    public double square(){
        return length*width;
    }
}