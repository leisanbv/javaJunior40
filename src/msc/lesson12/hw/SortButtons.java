package msc.lesson12.hw;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButtons {

    public void sortByBrandFromTo(TreeSet<Kettle> kettles){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(!o1.getBrand().equals(o2.getBrand())){
                    return o1.getBrand().compareTo(o2.getBrand());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return o1.getPrice() - o2.getPrice();
                }
                if(!o1.getColor().equals(o2.getColor())){
                    return o1.getBrand().compareTo(o2.getBrand());
                }
                if(!o1.getFinish().equals(o2.getFinish())){
                    return o1.getFinish().compareTo(o2.getFinish());
                }
                if(o1.getWattage() != o2.getWattage()){
                    return o1.getWattage() - o2.getWattage();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }

                return 0;
            }
        });

        forSorting.addAll(kettles);

        for(Kettle k: forSorting){
            System.out.println(k);
        }
    }
}
