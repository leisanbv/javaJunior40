package msc.lesson11;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Hw {
    /**
     * Утилиты для работы с коллекциями объектов
     *
     * @author nedis
     * @version 1.0
     */


    /**
     * Объединение двух коллекций с дубликатами
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая объединение a и b, может содержать дубликаты
     * @throws NullPointerException если a или b == null
     */
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) {
        if (a == null || b == null) {
            throw new NullPointerException("one of the parameters is null");
        }
        Collection<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    /**
     * Пересечение двух коллекций с дубликатами
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая пересечение a и b, может содержать дубликаты
     * @throws NullPointerException если a или b == null
     */
    Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("one of the parameters is null");
        }

        a.retainAll(b);
        return a;
        //OR

//        Collection<Integer> result = new LinkedList<>();
//        for(Integer num: a){
//            if(b.contains(num)){
//                result.add(num);
//            }
//        }
//        for(Integer num: b){
//            if(a.contains(num)){
//                result.add(num);
//            }
//        }
//
//        return result;
    }

    /**
     * Объединение двух коллекций без дубликатов
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая объединение a и b без дубликатов
     * @throws NullPointerException если a или b == null
     */
    Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException{
        if (a == null || b == null) {
            throw new NullPointerException("one of the parameters is null");
        }
        Set<Integer> result= new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;

    }

    /**
     * Пересечение двух коллекций без дубликатов
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая пересечение a и b без дубликатов
     * @throws NullPointerException если a или b == null
     */
    Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException{
        if (a == null || b == null) {
            throw new NullPointerException("one of the parameters is null");
        }
        a.retainAll(b);
        return (Set<Integer>) a;
    }

    /**
     * Разность двух коллекций
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая разность a и b
     * @throws NullPointerException если a или b == null
     */
    Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("one of the parameters is null");
        }
        Set<Integer> set1 = new HashSet<>(a);
        set1.addAll(b);
        Set<Integer> set2 = new HashSet<>(a);
        set1.retainAll(b);
        set1.removeAll(set2);
        return set1;

        //OR

//        Collection<Integer> result = new HashSet<>(a);
//        result.removeAll(b);
//        return result;

        //OR

//          Collection<Integer> result = new LinkedList<>();
////        for(Integer num: a){
////            if(!b.contains(num)){
////                result.add(num);
////            }
////        }
////        for(Integer num: b){
////            if(!a.contains(num)){
////                result.add(num);
////            }
////        }
////
////        return result;


    }


}
