package com.springfile.springintro;

public class AwiringContainer {
    private int price;
    private String Product;

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AwiringContainer{" + "price=" + price + ", Product='" + Product + '\'' + '}';
    }
}
