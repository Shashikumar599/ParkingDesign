package com.Parking.ParkingDesign.Vehicle;
//import VehicleType;
public class Vehicle {
    int Vehicle_Number;
    String Owner;

    VehicleType vehicleType;
    Vehicle(int Vehicle_Number ,String Owner ){
        this.Vehicle_Number=Vehicle_Number;
        this.Owner=Owner;
//        this.Tyre=Tyre;
    }

    public int getVehicle_Number() {
        return Vehicle_Number;
    }

    public void setVehicle_Number(int vehicle_Number) {
        Vehicle_Number = vehicle_Number;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
