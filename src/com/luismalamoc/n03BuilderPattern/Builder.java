package com.luismalamoc.n03BuilderPattern;

public interface Builder {

    void startUpOperations();
    void buidBody();
    void insertWheels();
    void addHeadLights();
    void endOperations();
    Product getVehicle();
}
