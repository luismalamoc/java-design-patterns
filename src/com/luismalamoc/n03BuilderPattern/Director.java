package com.luismalamoc.n03BuilderPattern;

public class Director {

    Builder builder;

    public void construct(Builder builder){
        this.builder = builder;
        builder.startUpOperations();
        builder.buidBody();
        builder.insertWheels();
        builder.addHeadLights();
        builder.endOperations();
    }
}
