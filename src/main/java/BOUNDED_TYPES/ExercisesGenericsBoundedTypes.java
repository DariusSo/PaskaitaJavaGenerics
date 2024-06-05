package BOUNDED_TYPES;

import java.util.*;

public class ExercisesGenericsBoundedTypes <T extends Number, V extends CharSequence> {
    public static void main(String[] args) {
        //3.1 Uzduotis: compareArrays
        ExercisesGenericsBoundedTypes egbt = new ExercisesGenericsBoundedTypes();
        Integer[] arrayInt01 = {1,2,3,4};
        Integer[] arrayInt02 = {1,2,3,4};
        Integer[] arrayInt03 = {1,2,3,3};
        Integer[] arrayInt04 = {1,2,3};

        System.out.println(egbt.compareArrays(arrayInt01,arrayInt02));
        System.out.println(egbt.compareArrays(arrayInt01,arrayInt03));
        System.out.println(egbt.compareArrays(arrayInt01,arrayInt04));
        System.out.println("-".repeat(25));

        Double[] arrayDbl01 = {1.0,2.0,3.0,4.0};
        Double[] arrayDbl02 = {1.0,2.0,3.0,4.0};
        Double[] arrayDbl03 = {1.0,2.0,3.0,3.0};
        Double[] arrayDbl04 = {1.0,2.0,3.0};

        System.out.println(egbt.compareArrays(arrayDbl01,arrayDbl02));
        System.out.println(egbt.compareArrays(arrayDbl01,arrayDbl03));
        System.out.println(egbt.compareArrays(arrayDbl01,arrayDbl04));
        System.out.println("-".repeat(25));
        //3.2 Uzduotis: sumEvenAndOdd
        List<Integer> listInt01 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> listDbl01 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        System.out.println(egbt.sumEvenAndOdd(listInt01));
        System.out.println(egbt.sumEvenAndOdd(listDbl01));
        System.out.println("-".repeat(25));
        //3.3 Uzduotis: findIndex
        List<String> stringList = List.of("apple", "banana", "cherry", "orange");
        List<Integer> listInt02 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(egbt.findIndex(stringList, "cherry"));
        System.out.println(egbt.findIndex(stringList, "kiwi"));
        //System.out.println(egbt.findIndex(listInt02, 2)); // compile error
        System.out.println("-".repeat(25));
        //3.4 Uzduotis: reversList
        List<String> stringList02 = List.of("apple", "banana", "cherry", "orange");
        List<Integer> listInt03 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(egbt.reverseList(stringList02));
        // System.out.println(ExercisesGenericsBoundedTypes.reverseList(listInt03)); // compile erro
        System.out.println("-".repeat(25));
        //3.5 Uzduotis: mergeEverySecondElement
        List<String> stringList03 = List.of("apple", "banana", "cherry", "orange");
        List<String> stringList04 = List.of("kiwi", "fig", "melon", "mango", "mandarin","grapes" );
        System.out.println(egbt.mergeEverySecondElement(stringList03,stringList04));
    }
    public boolean compareArrays(T[] array, T[] array2){
        if(array.length != array2.length){
            return false;
        }else{
            for(int i = 0; i < array.length; i++){
                if(!Objects.equals(array[i], array2[i])){
                    return false;
                }
            }
        }
        return true;
    }
    public Map<String, Double> sumEvenAndOdd(List<T> arrayList){
        Map<String, Double> mapSum = new HashMap<>();
        mapSum.put("Lyginiai:", 0.0);
        mapSum.put("Nelyginiai:", 0.0);
        for(T t : arrayList){
            double temp = Double.parseDouble(String.valueOf(t));
            if (temp % 2 == 0){
                mapSum.put("Lyginiai:", temp + mapSum.get("Lyginiai:"));
            }else{
                mapSum.put("Nelyginiai:", temp + mapSum.get("Nelyginiai:"));
            }
        }
    return mapSum;
    }
    public Map<String, Double> sumEvenAndOdd1(List<? extends Number> arrayList){
        Map<String, Double> mapSum = new HashMap<>();
        mapSum.put("Lyginiai:", 0.0);
        mapSum.put("Nelyginiai:", 0.0);
        for(Number t : arrayList){
            double temp = Double.parseDouble(String.valueOf(t));
            if (temp % 2 == 0){
                mapSum.put("Lyginiai:", temp + mapSum.get("Lyginiai:"));
            }else{
                mapSum.put("Nelyginiai:", temp + mapSum.get("Nelyginiai:"));
            }
        }
        return mapSum;
    }
    public Map<String, Double> sumEvenAndOdd2(List<? extends Integer> arrayList){
        Map<String, Double> mapSum = new HashMap<>();
        mapSum.put("Lyginiai:", 0.0);
        mapSum.put("Nelyginiai:", 0.0);
        for(Integer t : arrayList){
            double temp = Double.parseDouble(String.valueOf(t));
            if (temp % 2 == 0){
                mapSum.put("Lyginiai:", temp + mapSum.get("Lyginiai:"));
            }else{
                mapSum.put("Nelyginiai:", temp + mapSum.get("Nelyginiai:"));
            }
        }
        return mapSum;
    }
    public Map<String, Double> sumEvenAndOdd3(List<?> arrayList){
        Map<String, Double> mapSum = new HashMap<>();
        mapSum.put("Lyginiai:", 0.0);
        mapSum.put("Nelyginiai:", 0.0);
        for(Object t : arrayList){
            double temp = Double.parseDouble(String.valueOf(t));
            if (temp % 2 == 0){
                mapSum.put("Lyginiai:", temp + mapSum.get("Lyginiai:"));
            }else{
                mapSum.put("Nelyginiai:", temp + mapSum.get("Nelyginiai:"));
            }
        }
        return mapSum;
    }

    public int findIndex(List<V> charSequence, CharSequence s){
        return charSequence.indexOf(s);
    }
    public List<V> reverseList(List<V> list){
        return list.reversed();
    }
    public List<? extends CharSequence> reverseList1(List<? extends CharSequence> list){
        return list.reversed();
    }
    public List<? extends String> reverseList2(List<? extends String> list){
        return list.reversed();
    }
    public List<?> reverseList3(List<?> list){
        return list.reversed();
    }
    public List<V> mergeEverySecondElement(List<V> list, List<V> list2){
        List <V> temp = new ArrayList<>();
        if (list.size() > list2.size()){
            for(int i = 0; i < list.size(); i++){
                temp.add(list.get(i));
                try{
                    temp.add(list2.get(i));
                }catch (IndexOutOfBoundsException e){
                }
            }
        }else{
            for(int i = 0; i < list2.size(); i++){
                temp.add(list2.get(i));
                try{
                    temp.add(list.get(i));
                }catch (IndexOutOfBoundsException e){
                }
            }
        }
        return temp;
    }
}
