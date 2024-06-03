package GENERIC_CLASSES;

import org.example.SimpleBox;

public class Main {
    public static void main(String[] args) {
        //1.1 Uzduotis: Pair
        Pair<String, Integer> pair = new Pair("Vienas", 2);
        System.out.println(pair);
        pair.setValues("Kiekis", 1);
        System.out.println(pair);

        //1.2 Uzduotis: ListOperations
        ListOperations<String> lop = new ListOperations<>();
        lop.addElement("Milk");
        lop.addElement("Eggs");
        for(String s : lop.getElements()){
            System.out.println(s);
        }
        lop.removeElement(0);
        for(String s : lop.getElements()){
            System.out.println("Po pasalinimo:");
            System.out.println(s);
        }
        //1.3 Uzduotis: PairList
        PairList<String, Integer> pr = new PairList<>();
        pr.addPair("Kiekis:", 1);
        pr.addPair("Kiekis:", 5);
        pr.addPair("Kiekis:", 8);
        for(Pair p : pr.getPairs()){
            System.out.println(p);
        }
        pr.removePair(1);
        System.out.println("Po pasalinimo:");
        for(Pair p : pr.getPairs()){
            System.out.println(p);
        }
        pr.removePair(4);
    }
}