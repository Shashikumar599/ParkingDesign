package com.Parking.ParkingDesign;

import com.Parking.ParkingDesign.ParkingSpot.*;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager2;

import com.Parking.ParkingDesign.EntryGate.EntryGate;
import com.Parking.ParkingDesign.Ticket.Ticket;
import com.Parking.ParkingDesign.Vehicle.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class }*/)
public class ParkingDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingDesignApplication.class, args);

		System.out.println("Hello world!");
//         Map<Object,Object> map=new HashMap<>();
//
//		 map.put("Owner","Shashi");
//		 map.put("Vehicleno",1432);
//		 map.put("VehicleType",2);

//		 Vehicle vehicle=Vehiclefactory.getVehicle(map);
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
