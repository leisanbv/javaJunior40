package msc.lesson10;

public class Magazine extends PrintedEdition{
    private int numsInYear;

    public Magazine() {
    }

    public Magazine(String name, int year, String publishingHouse, int numsInYear) {
        super(name, year, publishingHouse);
        this.numsInYear = numsInYear;
    }

    public int getNumsInYear() {
        return numsInYear;
    }

    public void setNumsInYear(int numsInYear) {
        this.numsInYear = numsInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        return numsInYear == magazine.numsInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numsInYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал{" +
                "номер в году = " + numsInYear + ", " + super.toString() +
                '}';
    }

}
