package msc.lesson10;

import java.util.Objects;

public class PrintedEdition {
    private String name;
    private int year;
    private String publishingHouse;

    public PrintedEdition() {
    }

    public PrintedEdition(String name, int year, String publishingHouse) {
        this.name = name;
        this.year = year;
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintedEdition that = (PrintedEdition) o;

        if (year != that.year) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(publishingHouse, that.publishingHouse);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " имя='" + name + '\'' +
                ", год выпуска = " + year +
                ", издательство = " + publishingHouse;
    }
}
