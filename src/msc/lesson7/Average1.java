package msc.lesson7;

public class Average1 {
    //получить среднее значение
    //int[] i = {12,3,23,463,56,232134,3466,567,32};
    //int avg =oper.getAvg(i);

    public static double getAverage(int[] db) {
        int sum = 0;

        for (int j = 0; j < db.length; j++) {
            sum+=db[j];
        }
        double avr = (sum*1.0) / db.length;
        return avr;
    }

}


