package com.luismalamoc.n03BuilderPattern;

public class MotorCycle implements Builder {

    private String brandName;
    private Product product;

    public MotorCycle(String brand){
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperations() {
        // nothing
    }

    @Override
    public void buidBody() {
        product.add("This is a body of a MotorCycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 Headlights are added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("MotorCycle model is: %s", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
