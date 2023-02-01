package com.Parking.ParkingDesign.Vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Vehicledao extends JpaRepository<Vehicle, Integer> {

}
