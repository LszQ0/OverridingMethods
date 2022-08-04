package com.company;

public class Animal {
    public Animal(String name) {
        this.name = name;
    }
    String name;
    public void getVoice() { //dodanie slowa final blokuje nadpisywanie metody
        System.out.println("Default voice");
    }

}
