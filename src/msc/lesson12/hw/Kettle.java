package msc.lesson12.hw;

import java.util.Objects;

public class Kettle implements Comparable<Kettle>{

    private String brand;
    private String color;
    private String finish;
    private int wattage;
    private int price;
    private double capacity;

    @Override
    public String toString() {
        return "Kettle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", finish='" + finish + '\'' +
                ", wattage=" + wattage +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }

    public Kettle(String brand, String color, String finish, int wattage, int price, double capacity) {
        this.brand = brand;
        this.color = color;
        this.finish = finish;
        this.wattage = wattage;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kettle kettle = (Kettle) o;

        if (wattage != kettle.wattage) return false;
        if (price != kettle.price) return false;
        if (Double.compare(kettle.capacity, capacity) != 0) return false;
        if (!Objects.equals(brand, kettle.brand)) return false;
        if (!Objects.equals(color, kettle.color)) return false;
        return Objects.equals(finish, kettle.finish);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (finish != null ? finish.hashCode() : 0);
        result = 31 * result + wattage;
        result = 31 * result + price;
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Kettle(){

    }

    public Kettle(String brand, String color, String finish, int wattage, double capacity) {
        this.brand = brand;
        this.color = color;
        this.finish = finish;
        this.wattage = wattage;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Kettle o) {
        if(!this.getBrand().equals(o.getBrand())){
            return this.getBrand().compareTo(o.getBrand());
        }
        if(this.getPrice() != o.getPrice()){
            return this.getPrice() - o.getPrice();
        }
        if(!this.getColor().equals(o.getColor())){
            return this.getBrand().compareTo(o.getBrand());
        }
        if(!this.getFinish().equals(o.getFinish())){
            return this.getFinish().compareTo(o.getFinish());
        }
        if(this.getWattage() != o.getWattage()){
            return this.getWattage() - o.getWattage();
        }
        if(this.getCapacity() != o.getCapacity()){
            return Double.compare(this.getCapacity(), o.getCapacity());
        }

        return 0;
    }
}
