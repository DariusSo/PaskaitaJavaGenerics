package GENERIC_CLASSES;

import java.util.ArrayList;

public class PairList <T, U>{
    private ArrayList<Pair<T, U>> pairs = new ArrayList<>();

    public void addPair(T first, U second){

        Pair<T, U> pair = new Pair<>(first, second);
        pairs.add(pair);

    }
    public void getPair(int index){
        try{
            pairs.get(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<Pair<T, U>> getPairs(){
        return pairs;
    }
    public void removePair(int index){
        try{
            Pair<T, U> removable = pairs.get(index);
            pairs.remove(removable);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
