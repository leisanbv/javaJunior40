package msc.lesson12;

import java.util.Objects;

public class Coin implements Comparable<Coin>{

    private int nominal;
    private double diameter;
    private String metal;
    private int year;

    private Coin(){
    }

    public Coin(int nominal, double diameter, String metal, int year) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.metal = metal;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal = " + nominal +
                ", diameter = " + diameter +
                ", metal = '" + metal + '\'' +
                ", year = " + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diameter, diameter) != 0) return false;
        if (year != coin.year) return false;
        return Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        if(this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }
        if(this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();
        }
        if(this.getDiameter() != o.getDiameter()){
            return Double.compare(this.getDiameter(), o.diameter);
        }

        return this.getMetal().compareTo(o.getMetal());
    }
}

