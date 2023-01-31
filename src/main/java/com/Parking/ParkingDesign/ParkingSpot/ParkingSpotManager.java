package com.Parking.ParkingDesign.ParkingSpot;
import com.Parking.ParkingDesign.Vehicle.Vehicle;
import com.Parking.ParkingDesign.Ticket.*;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpot;

import java.util.*;
public class ParkingSpotManager {
     public ArrayList<ParkingSpot> ParkingSpots;

     public HashMap<Vehicle,Integer> VehicleParking;
     ParkingSpotType parkingSpotType;
     public void AddParkingSpot( ParkingSpot parkingSpot){
         ParkingSpots.add(parkingSpot);
     }
     public void RemoveParkingSpot(ParkingSpot parkingSpot) {
         ParkingSpots.remove(parkingSpot);
     }
     public int AddVehicle(Vehicle vehicle){
         int Availble=FindSpot();
         if(Availble==-1)
         {
//             System.out.println("Sorry No Space Availble\n");
             return -1;
         }
         ParkingSpots.get(Availble).Add(vehicle);
         VehicleParking.put(vehicle,Availble);
         return ParkingSpots.get(Availble).Id;
     }

     public void RemoveVehicle(Vehicle vehicle){
              int index= VehicleParking.get(vehicle);
         ParkingSpots.get(index).Remove(vehicle);
         VehicleParking.remove(vehicle);
     }
     private int FindSpot(){
         for(int i=0;i<ParkingSpots.size();i++){
             if(ParkingSpots.get(i).isempty)
                 return i;
         }
         return -1;
     }
}
