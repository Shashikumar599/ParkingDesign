package com.Parking.ParkingDesign.ParkingSpot;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class ParkingSpotManager3 extends ParkingSpotManager{
    public ParkingSpotManager3(){
        this.parkingSpotType=ParkingSpotType.ThreeWheelParkingSpot;
        this.ParkingSpots=new ArrayList<>();
        this.VehicleParking=new HashMap<>();
    }
}
