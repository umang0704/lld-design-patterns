package org.lld.behavioural.abstarctfactory;

public class MicroCar extends Car {

    public MicroCar(){};

    @Override
    public void setVehicleType(){
        carType = "Micro";
    }

    @Override
    public void setBaseCost(){
        baseCost = 50;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }
}
