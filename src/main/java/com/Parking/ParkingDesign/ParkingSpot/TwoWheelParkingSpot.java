package com.Parking.ParkingDesign.ParkingSpot;

public class TwoWheelParkingSpot extends ParkingSpot{
    TwoWheelParkingSpot(int Id,  int Price , ParkingSpotType parkingSpotType){
        super(Id);
        this.Price=Price;
        this.isempty=true;
        this.parkingSpotType=ParkingSpotType.ThreeWheelParkingSpot;
    }
}
