package com.luismalamoc.n04FactoryMethodPattern;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
