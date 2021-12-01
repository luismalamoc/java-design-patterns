package com.luismalamoc.n02PrototypePattern;

public class PrototypePatternExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar nano = new Nano("Green Nano");
        nano.basePrice = 100000;

        BasicCar ford = new Ford("Ford Yellow");
        ford.basePrice = 500000;

        // nano
        BasicCar bc1;
        bc1 = nano.clone();
        bc1.onRoadPrice = nano.onRoadPrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is: " + bc1.onRoadPrice);

        // ford
        bc1 = ford.clone();
        bc1.onRoadPrice = ford.onRoadPrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is: " + bc1.onRoadPrice);
    }
}
