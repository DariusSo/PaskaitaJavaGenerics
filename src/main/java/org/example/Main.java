package org.example;

public class Main {
    public static void main(String[] args) {
        //Slack Uzduotis
        SimpleBox<String> s = new SimpleBox<>();
        s.setContent("Kontentas");
        System.out.println(s.getContent());
        SimpleBox<Integer> i = new SimpleBox<>();
        i.setContent(3);
        System.out.println(i.getContent());
        //
    }
}