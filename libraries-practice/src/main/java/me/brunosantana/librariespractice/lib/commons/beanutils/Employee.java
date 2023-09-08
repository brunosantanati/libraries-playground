package me.brunosantana.librariespractice.lib.commons.beanutils;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Employee {

    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return new ReflectionToStringBuilder(this, new RecursiveToStringStyle()).toString();
    }
}
