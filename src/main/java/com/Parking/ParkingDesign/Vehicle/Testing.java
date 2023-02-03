package com.Parking.ParkingDesign.Vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Testing {
    @Id
    int rollno;

    String name;

    public Testing() {
    }

    public Testing(int r, String na){
        rollno=r;
        name=na;
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
