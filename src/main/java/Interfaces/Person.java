package Interfaces;

public class Person implements Info {// klasa moze implementować (zapis po przecinku) wiele interfejsów, w odróżnieniu od dziedziczenia gdzie może mieć tylko 1 przodka

    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello there.");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + name);
    }
}
