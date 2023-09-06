package me.brunosantana.librariespractice.lib.commons.lang;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return new ReflectionToStringBuilder(this, new RecursiveToStringStyle()).toString();
    }

}
