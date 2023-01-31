package com.Parking.ParkingDesign.ParkingSpot;



import java.util.ArrayList;
import java.util.HashMap;

public class ParkingSpotManager2 extends ParkingSpotManager{
    public ParkingSpotManager2(){
        this.parkingSpotType=ParkingSpotType.TwoWheelParkingSpot;
        this.ParkingSpots=new ArrayList<>();
        this.VehicleParking=new HashMap<>();
    }
}
