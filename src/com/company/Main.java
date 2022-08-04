package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat ("Kitku"); //wywołuje klasę Cat
        cat.getVoice(); // wywołanie metody getVoice z klasy Cat

        //Animal animal = new Animal ("Default");  //wywołanie animal, pojawia sie Default voice
        //animal.getVoice();

        System.out.println(cat.toString());

    }
}
