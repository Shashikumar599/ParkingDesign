package com.Parking.ParkingDesign;

import com.Parking.ParkingDesign.ParkingSpot.*;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager2;

import com.Parking.ParkingDesign.EntryGate.EntryGate;
import com.Parking.ParkingDesign.Ticket.Ticket;
import com.Parking.ParkingDesign.Vehicle.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ParkingDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingDesignApplication.class, args);

		System.out.println("Hello world!");
		ParkingSpotManager parkingSpotManager2=new ParkingSpotManager2();
		for(int i=0;i<10;i++){
			parkingSpotManager2.ParkingSpots.add(new ParkingSpot(i+1));
		}
		ParkingSpotManager parkingSpotManager3=new ParkingSpotManager3();
		for(int i=0;i<2;i++){
			parkingSpotManager3.ParkingSpots.add(new ParkingSpot(i+20));
		}
//		Vehicle vehicle1=new ThreeWheel(1234 ,"P A");
//		Ticket ticket1= EntryGate.CreateTicket(vehicle1 ,parkingSpotManager3,3);
//
//		Vehicle vehicle2=new ThreeWheel(2341 ,"S K");
//		Ticket ticket2= EntryGate.CreateTicket(vehicle2 ,parkingSpotManager3,3);
//
//		Vehicle vehicle3=new ThreeWheel(3412 ,"T D");
//		Ticket ticket3= EntryGate.CreateTicket(vehicle3 ,parkingSpotManager3,3);
//
//		ExitGate.VehicleExit(ticket2,3,parkingSpotManager3);
	}

}
