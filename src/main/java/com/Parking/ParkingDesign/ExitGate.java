package com.Parking.ParkingDesign;

import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager;
import com.Parking.ParkingDesign.Ticket.Ticket;

public class ExitGate {
    public static void VehicleExit(Ticket ticket, int CurrTime , ParkingSpotManager parkingSpotManager){
        int payment=ticket.cost(CurrTime);
        Payment(payment);
        parkingSpotManager.RemoveVehicle(ticket.getVehicle());
        System.out.println("Vehicle  " + ticket.getVehicle().getVehicle_Number() + " left parking lot ");
    }
    static void  Payment(int payment)
    {
        System.out.println("Payment of " + payment + " Recieved ");
    }
}
