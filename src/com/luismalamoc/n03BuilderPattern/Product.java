package com.luismalamoc.n03BuilderPattern;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product(){
        parts = new LinkedList<String>();
    }

    public void add(String part){
        parts.add(part);
    }

    public void showProduct(){
        System.out.println("\nProduct completed as below: ");
        for (String part: parts)
            System.out.println(part);
    }
}
