package com.Parking.ParkingDesign.Vehicle;

import com.Parking.ParkingDesign.Vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public  interface Vehicledao extends JpaRepository<Vehicle, Integer> {

}
