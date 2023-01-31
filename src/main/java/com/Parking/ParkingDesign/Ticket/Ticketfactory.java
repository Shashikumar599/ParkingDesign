package com.Parking.ParkingDesign.Ticket;


import com.Parking.ParkingDesign.Vehicle.Vehicle;
import com.Parking.ParkingDesign.Vehicle.VehicleType;

public class Ticketfactory {
    public static Ticket ProvideTicket(int EntryTime , int ParkingSpotId , Vehicle vehicle){
        if(vehicle.getVehicleType().equals(VehicleType.TwoWheeler)){
            return new TicketTwoWheel(EntryTime ,ParkingSpotId ,vehicle);
        }
        else {
            return new TicketThreeWheel(EntryTime ,ParkingSpotId ,vehicle);
        }
    }
}
