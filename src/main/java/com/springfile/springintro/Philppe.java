package com.springfile.springintro;

public class Philppe {
    public int price ;
    public String name ;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void initmethod(){
        System.out.println("Initializing the bean!");
    }
    public void destroymethod(){
        System.out.println("Destroying the bean!");
    }
}
