package com.luismalamoc.n03BuilderPattern;

import java.lang.module.ModuleFinder;

public interface ModifiedBuilder {

    ModifiedBuilder startUpOperations(String startUpMessage);
    ModifiedBuilder buildBody(String bodyType);
    ModifiedBuilder insertWheels(int noOfWheels);
    ModifiedBuilder addHeadlights(int noOfHeadLights);
    ModifiedBuilder endOperations(String endOperationsMessage);
    ProductClass constructCar();
    ProductClass getConstructedCar();
}
