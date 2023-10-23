package com.practice.programs.java8;

public class Employee {

    public Employee(String name){
        this.name = name;
    }
    String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        return true;
    }
}
