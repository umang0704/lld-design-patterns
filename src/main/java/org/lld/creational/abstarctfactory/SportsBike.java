package org.lld.creational.abstarctfactory;

public class SportsBike extends Bike {

    public SportsBike(){}

    @Override
    public void setVehicleType(){
        bikeType = "Sports";
    }

    @Override
    public void setBaseCost(){
        baseCost = 40;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 15;
    }
}
