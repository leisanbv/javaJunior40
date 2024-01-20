package msc.lesson8;

public class Parallelepiped {
    private int lengthOfParallelepiped;
    private int widthOfParallelepiped;
    private int heightOfParallelepiped;

    public void setLengthOfParallelepiped(int lengthOfParallelepiped) {
        if (lengthOfParallelepiped > 0) {
            this.lengthOfParallelepiped = lengthOfParallelepiped;
        }
    }

    public int getLengthOfParallelepiped() {
        return this.lengthOfParallelepiped;
    }

    public void setWidthOfParallelepiped(int widthOfParallelepiped) {
        if (widthOfParallelepiped > 0) {
            this.widthOfParallelepiped = widthOfParallelepiped;
        }
    }

    public int getWidthOfParallelepiped() {
        return this.widthOfParallelepiped;
    }

    public void setHeightOfParallelepiped(int heightOfParallelepiped) {
        if (heightOfParallelepiped > 0) {
            this.heightOfParallelepiped = heightOfParallelepiped;
        }
    }

    public int getHeightOfParallelepiped() {
        return this.heightOfParallelepiped;
    }

    public double perimeter() {
        return 4 * (lengthOfParallelepiped + widthOfParallelepiped + heightOfParallelepiped);
    }

    public double area() {
        return 2 * ((lengthOfParallelepiped * widthOfParallelepiped) + (widthOfParallelepiped * heightOfParallelepiped) + (heightOfParallelepiped * lengthOfParallelepiped));
    }

}
