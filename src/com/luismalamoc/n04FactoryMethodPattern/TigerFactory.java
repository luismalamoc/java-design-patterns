package com.luismalamoc.n04FactoryMethodPattern;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
