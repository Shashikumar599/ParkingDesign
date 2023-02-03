package com.Parking.ParkingDesign.Vehicle;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//import VehicleType;
@Entity  @Component
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Vehicle_Number;
    String Owner;

    VehicleType vehicleType;
    public Vehicle(){};
    public  Vehicle(int Vehicle_Number ,String Owner ){
        this.Vehicle_Number=Vehicle_Number;
        this.Owner=Owner;
        this.vehicleType= VehicleType.valueOf("TwoWheeler");
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
