package org.example;

public class Truck implements Vehicle{
    private final String brand;
    private final String truckNo;
    private DrivingStrategy drivingStrategy;

    Truck(String brand, String truckNo){
        this.brand=brand;
        this.truckNo=truckNo;
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
