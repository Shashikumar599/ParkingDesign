package com.Parking.ParkingDesign.Vehicle;

import com.Parking.ParkingDesign.Ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface Testingdao extends JpaRepository<Testing, Integer> {
}
