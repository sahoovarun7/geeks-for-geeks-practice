package com.practice.programs.java8;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        Employee employee = new Employee("Varun");
        Employee employee2 = new Employee("Sahoo");

        Employee temp = employee2;

        HashMap<Employee,String> hm= new HashMap<>();
        hm.put(employee,"Trukker");
        hm.put(employee2,"Moxey");

        System.out.println("Hm : "+hm.get(employee));
        employee2.equals(employee);

        System.out.println(temp.hashCode()+" "+employee.hashCode() +" |  "+employee2.hashCode());

    }
}
