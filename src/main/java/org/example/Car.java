package org.example;

public class Car implements Vehicle{
    private final String brand;
    private final String carNo;
    private DrivingStrategy drivingStrategy;

     Car(String brand, String carNo) {
        this.brand = brand;
        this.carNo = carNo;
    }


    @Override
    public void drive() {
        drivingStrategy.drive();
    }

    @Override
    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
         this.drivingStrategy=drivingStrategy;
    }
}
