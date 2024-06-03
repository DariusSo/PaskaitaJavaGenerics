package GENERIC_CLASSES;

import java.util.ArrayList;
import java.util.List;

public class ListOperations <T>{
    private List<T> elements = new ArrayList<>();

    public void addElement(T element){
        this.elements.add(element);
    }
    public void removeElement(int index){
        try{
            T element = this.elements.get(index);
            this.elements.remove(element);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public List<T> getElements() {
        return elements;
    }
}
