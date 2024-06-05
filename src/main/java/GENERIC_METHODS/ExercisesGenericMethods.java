package GENERIC_METHODS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExercisesGenericMethods <T>{
    public static Random r = new Random();
    public static void main(String[] args) throws Exception {
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
        Character[] charReference = null;
        Character[] charList = randomCharArray();
        emChar.printList(emChar.arrayToList(charList));
        emChar.printList(emChar.arrayToList(new Character[0]));
        emChar.printList(emChar.arrayToList(charReference));
        //2.3 Uzduotis: swap indexes
        emChar.swap(charList, 0, 1);
        emChar.printArray(charList);
        //emChar.swap(charList, 0, charList.length);
        //emChar.swap(new Character[0], 0, 1);
        //emChar.swap(charReference, 0, 1);





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
        }
        System.out.println("]");
    }
    public void swap(T[] array, int indexFirst, int indexSecond) throws Exception {
        if(array == null){
            throw new NullPointerException();
        }
        try{
            T temp = array[indexFirst];
            array[indexFirst] = array[indexSecond];
            array[indexSecond] = temp;
        }catch (ArrayIndexOutOfBoundsException e){
            throw new Exception("Please check an instance of array or indices");
        }
    }


}
