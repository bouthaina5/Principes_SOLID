package com.directi.training.srp.exercise;

import java.util.ArrayList;

public class CarAnalyser {
	
	public Car getBestCar(ArrayList<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
