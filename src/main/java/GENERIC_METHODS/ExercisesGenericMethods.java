package GENERIC_METHODS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExercisesGenericMethods <T>{
    public static Random r = new Random();
    public static void main(String[] args) {
        ExercisesGenericMethods<Integer> emInt = new ExercisesGenericMethods();
        ExercisesGenericMethods<String> emString = new ExercisesGenericMethods();
        ExercisesGenericMethods<Character> emChar = new ExercisesGenericMethods<>();
        //2.1 Uzduotis: printArray
        Integer[] intArray = {5, 14, 456, 23, 123, 45};
        String[] stringArray = {"Zodis1", "Zodis2", "Zodis3", "Zodis4", "Zodis5"};
        emInt.printArray(intArray);
        emString.printArray(stringArray);
        emInt.printArray(randomIntArray());
        emChar.printArray(randomCharArray());
        emChar.printArray(null);
        emString.printArray(new String[0]);
        //2.2 Uzduotis: arrayToList
        emChar.printList(emChar.arrayToList(randomCharArray()));


    }
    public void printArray(T[] array) {
        try{
            System.out.print("[");
            for(int i = 0; i < array.length; i++){
                if(i == array.length - 1){
                    System.out.print(array[i]);
                }else{
                    System.out.print(array[i] + ", ");
                }

            }
            System.out.println("]");
        }catch (NullPointerException e){
            System.out.println("]");
        }
    }
    public static Integer[] randomIntArray(){
        Integer[] randomArray = new Integer[r.nextInt(1, 100)];
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = r.nextInt(1, 100);
        }
        return randomArray;
    }
    public static Character[] randomCharArray(){
        Character[] randomCharacterArray = new Character[r.nextInt(1, 100)];
        for(int i = 0; i < randomCharacterArray.length; i++){
            randomCharacterArray[i] = (char) r.nextInt(62, 122);
        }
        return randomCharacterArray;
    }
    public List<T> arrayToList(T[] array){
        try{
            return new ArrayList<>(Arrays.asList(array));
        }catch (NullPointerException e){
            return new ArrayList<>();
        }
    }
    public void printList(List<T> arrayList){
        int size = arrayList.size();
        int nr = 0;
        System.out.print("[");
        for(T e : arrayList){
            if(nr == size - 2){
                System.out.print(e);
            }else{
                System.out.print(e + ", ");
            }
            System.out.println("]");
        }
    }

}
