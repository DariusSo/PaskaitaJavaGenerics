package GENERIC_INTERFACES;

import java.util.ArrayList;
import java.util.List;

public class StringListProcessorImpl implements ListProcessor<String>{
    private final List<String> stringList;

    public static void main(String[] args) throws Exception {

        StringListProcessorImpl slpi = new StringListProcessorImpl();
        System.out.println(slpi.isEmpty());
        slpi.addElement("asdf");
        System.out.println(slpi.isEmpty());
        slpi.removeElement("asdf");
        System.out.println(slpi.isEmpty());
    }

    public StringListProcessorImpl() {
        this.stringList = new ArrayList<>();
    }

    @Override
    public void addElement(String element) {
        stringList.add(element);
    }

    @Override
    public void removeElement(String element) {
        stringList.remove(element);
    }

    @Override
    public boolean isEmpty() {
        if (stringList.size() == 0){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        String print = "";
        for(String s : stringList){
            print += print + "Elementas: " + s + " \n";
        }
        return print;
    }
}
