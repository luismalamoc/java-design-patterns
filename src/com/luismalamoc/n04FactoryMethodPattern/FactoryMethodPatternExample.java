package com.luismalamoc.n04FactoryMethodPattern;

public class FactoryMethodPatternExample {
    public static void main(String[] args){
        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }
}
