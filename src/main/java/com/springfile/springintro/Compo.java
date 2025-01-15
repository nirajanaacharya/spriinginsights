package com.springfile.springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("comp1")
public class Compo {
    private int age;
    private String name;
    @Autowired
    public Compo(@Value("12") int age, @Value("Nirajan") String name) {
        this.age = age;
        this.name = name;
        System.out.println("Compo " + name + " is " + age + " years old");
    }

    @Override
    public String toString() {
        return "Compo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
