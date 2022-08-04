package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void getVoice() {
        System.out.println("Meow");;
        super.getVoice(); //nie musi byc w kolejnosci rodzic->dziedzic
    }

    @Override
    public String toString() {
        return "I'm " + super.name;
    }
}
