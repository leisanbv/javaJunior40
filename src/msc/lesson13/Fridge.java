package msc.lesson13;

import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProduct(String product, int weight){
        if(products.containsKey(product)){
            products.put(product, weight + products.get(product));
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts(){
        for(Map.Entry<String, Integer> product: products.entrySet()){
            System.out.println(product.getKey() + "-" + product.getValue());
        }
    }

    public void getProduct(String product, int weight){
        if (!products.containsKey(product)){
            System.out.println("This product is not in the fridge");
            return;
        }
        if (products.get(product)<weight){
            System.out.println("Not enough" + product + "in the fridge");
            products.remove(product);
            return;
        }
        if (products.get(product) == weight){
            products.remove(product);
            return;
        }

        products.put(product, products.get(product)-weight);

        /**
         * Добавить методы:
         * 1) метод должен выводить на консоль те продукты, которые скоро закончатся (которых меньше 2х кг)
         * 2) вывести на консоль продукт которого больше всего в хол-ке
         * 3) вывестина консоль продукты, отсорт-е по названию
         * 4) отсорт-е по весу от меньшего
         */
    }
}
