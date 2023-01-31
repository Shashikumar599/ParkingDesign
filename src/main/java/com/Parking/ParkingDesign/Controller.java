package com.Parking.ParkingDesign;

import com.Parking.ParkingDesign.EntryGate.EntryGate;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/welcome")
    public String welcome(){
//        System.out.println("Park with us");
        return "Welcome, Park with us";
    }
//    @Produces(MediaType.APPLICATION_JSON)
    @PutMapping(value = "/BookTicket", produces = "application/json", consumes = "application/json")
    public Map<Object, Object> BookTicket(@RequestBody Map<Object, Object> payload) {
        Map<Object, Object> response = new HashMap<>();
        response.put("message", "Put request sucessfull");
        response.put("reqBody", payload);

        return response;
    }
}
