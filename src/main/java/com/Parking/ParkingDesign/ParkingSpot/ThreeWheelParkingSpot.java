package com.Parking.ParkingDesign.ParkingSpot;


public class ThreeWheelParkingSpot extends ParkingSpot{

    ThreeWheelParkingSpot(int Id,int Price , ParkingSpotType parkingSpotType){
        super(Id);
        this.Price=Price;
        this.isempty=true;
        this.parkingSpotType=ParkingSpotType.TwoWheelParkingSpot;
        System.out.println("ThreeWheelParkingSpot created");
    }
}
