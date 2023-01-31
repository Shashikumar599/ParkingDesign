package com.Parking.ParkingDesign.EntryGate;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager;
import com.Parking.ParkingDesign.Ticket.*;

import com.Parking.ParkingDesign.Vehicle.Vehicle;

public class EntryGate {
    public static Ticket CreateTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager, int CurrTime){
              int Id=parkingSpotManager.AddVehicle(vehicle);
              if(Id==-1){
                  System.out.println("Sorry No Parking Availble\n");
                  return null;
              }
              Ticket ticket= Ticketfactory.ProvideTicket(CurrTime ,Id ,vehicle);
              System.out.println("Vehicle" +vehicle.getVehicle_Number() +" entered in Parking lot at " +Id  );
              return ticket;
    }
}
