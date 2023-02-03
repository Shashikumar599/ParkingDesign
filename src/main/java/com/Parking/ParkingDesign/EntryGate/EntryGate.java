package com.Parking.ParkingDesign.EntryGate;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager;
import com.Parking.ParkingDesign.Ticket.*;

import com.Parking.ParkingDesign.Vehicle.Vehicle;
import com.Parking.ParkingDesign.Vehicle.Vehicledao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class EntryGate {
    @Autowired
//    @Qualifier("Vehicledao")
    private  Vehicledao vehicledao;
//    @Autowired
//    private static Ticketdao ticketdao;
    public EntryGate(){

    };
    public  Map<Object,Object> CreateTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager, int CurrTime){
              int Id=parkingSpotManager.AddVehicle(vehicle);
              Map<Object,Object> response=new HashMap<>();
              if(Id==-1){
                  System.out.println("Sorry No Parking Availble\n");
                  response.put("Ticket Status","Failed");
                  return response;
              }
              Ticket ticket= Ticketfactory.ProvideTicket(CurrTime ,Id ,vehicle);
              response.put("Ticket Status","Succesful");
              response.put("Ticket" ,ticket);
//              vehicledao.save(vehicle);
//              ticketdao.save(ticket);
              System.out.println("Vehicle" +vehicle.getVehicle_Number() +" entered in Parking lot at " +Id  );
              return response;
    }
}
