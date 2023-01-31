package com.Parking.ParkingDesign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/welcome")
    public String welcome(){
//        System.out.println("Park with us");
        return "Welcome ,Park with us";
    }
}
