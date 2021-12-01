package com.luismalamoc.n03BuilderPattern;

public class CarBuilder implements ModifiedBuilder {

    private String startUpMessage = "Start building the product";
    private String bodyType = "Steel";
    private int noOfWheels = 4;
    private int noOfHeadLights = 2;
    private String endOperationsMessage = "Product creation completed";

    ProductClass product;


    @Override
    public ModifiedBuilder startUpOperations(String startUpMessage) {
        this.startUpMessage=startUpMessage;
        return this;
    }

    @Override
    public ModifiedBuilder buildBody(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public ModifiedBuilder insertWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
        return this;
    }

    @Override
    public ModifiedBuilder addHeadlights(int noOfHeadLights) {
        this.noOfHeadLights = noOfHeadLights;
        return this;
    }

    @Override
    public ModifiedBuilder endOperations(String endOperationsMessage) {
        this.endOperationsMessage = endOperationsMessage;
        return this;
    }

    @Override
    public ProductClass constructCar() {
        product = new ProductClass(this.startUpMessage, this.bodyType, this.noOfWheels, this.noOfHeadLights,
                this.endOperationsMessage);
        return product;
    }

    @Override
    public ProductClass getConstructedCar() {
        return product;
    }
}
