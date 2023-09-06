package me.brunosantana.librariespractice.lib.commons.lang;

enum PetTypes {
    DOG, CAT, BIRD
}

public class Pet {

    private String name;
    private PetTypes type;
    private int age;

    public Pet(String name, PetTypes type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
}
