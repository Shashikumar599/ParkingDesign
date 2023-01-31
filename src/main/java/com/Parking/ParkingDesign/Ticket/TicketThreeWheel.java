package com.Parking.ParkingDesign.Ticket;

import com.Parking.ParkingDesign.Vehicle.Vehicle;

public class TicketThreeWheel extends Ticket{
    public TicketThreeWheel(int EntryTime , int ParkingSpotId , Vehicle vehicle ){
        super(EntryTime,ParkingSpotId,vehicle);
        this.FirstHour=30;
        this.NextHours=50;
    }

    public TicketThreeWheel() {

    }
}
