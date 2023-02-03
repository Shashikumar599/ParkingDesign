package com.Parking.ParkingDesign;

import com.Parking.ParkingDesign.EntryGate.EntryGate;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpot;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager2;
import com.Parking.ParkingDesign.ParkingSpot.ParkingSpotManager3;
import com.Parking.ParkingDesign.Vehicle.*;
//import com.Parking.ParkingDesign.Vehicle.index;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
//@org.springframework.stereotype.Controller
public class Controller {


    ParkingSpotManager parkingSpotManager2=new ParkingSpotManager2();


    ParkingSpotManager parkingSpotManager3=new ParkingSpotManager3();

    EntryGate entryGate=new EntryGate();
    @Autowired
    Testingdao testingdao;
    @Autowired
    Vehicledao vehicledao;
    @RequestMapping("/home")
    public ModelAndView home(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
//        return "index.html";
    }

    @GetMapping("/welcome")
    public String welcome(){
//        System.out.println("Park with us");
        for(int i=0;i<2;i++){
            parkingSpotManager3.ParkingSpots.add(new ParkingSpot(i+20));
        }
        for(int i=0;i<10;i++){
            parkingSpotManager2.ParkingSpots.add(new ParkingSpot(i+1));
        }
        System.out.println("welcome");
        return "Good morning , Let's begin";
    }
//    @Produces(MediaType.APPLICATION_JSON)
    @PutMapping(value = "/BookTicket", produces = "application/json", consumes = "application/json")
    public Map<Object, Object> BookTicket(@RequestBody Map<Object, Object> payload) {
        Map<Object, Object> response ;
        Vehicle vehicle= Vehiclefactory.getVehicle(payload);

        if(vehicle==null) {
            response=new HashMap<>();
            response.put("message", "Invalid request");
            response.put("reqBody", payload);
        }
        else
        {
//            response =EntryGate.CreateTicket(vehicle,)
            vehicledao.save(vehicle);
            testingdao.save(new Testing(23,"Shashi"));
            if(vehicle.getVehicleType().equals(VehicleType.TwoWheeler))
                response=entryGate.CreateTicket(vehicle,parkingSpotManager2,3);
            else
                response=entryGate.CreateTicket(vehicle,parkingSpotManager3,3);
        }
        return response;
    }
}
