package com.Parking.ParkingDesign.Vehicle;

public class ThreeWheel extends Vehicle{
    public ThreeWheel(int Vehicle_Number ,String Owner ){
        super(Vehicle_Number,Owner);
        this.vehicleType=VehicleType.ThreeWheeler;
    }

}
