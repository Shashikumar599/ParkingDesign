package com.Parking.ParkingDesign.Vehicle;

public class TwoWheel extends Vehicle{
    TwoWheel(int Vehicle_Number ,String Owner ){
        super(Vehicle_Number,Owner);
        System.out.println("Two Wheeler Created");
        this.vehicleType=VehicleType.TwoWheeler;
    }
}
