package com.Parking.ParkingDesign.Vehicle;

import java.util.Map;

public class Vehiclefactory {
    public static Vehicle getVehicle(Map<Object, Object> map){
        String Owner;
        int Vehicleno;
        int VehicleType;
        System.out.println("entry1");
        if(map.containsKey("Owner") && map.get("Owner").getClass().equals(String.class)){
            Owner= (String) map.get("Owner");
//            map.remove("Owner");
        }
        else
            return null;
        System.out.println("entry2");
        if(map.containsKey("Vehicleno") && map.get("Vehicleno").getClass().equals(Integer.class)){
            Vehicleno= (int) map.get("Vehicleno");
//            map.remove("Vehicleno");
        }
        else
            return null;
        System.out.println("entry3");
        if(map.containsKey("VehicleType") && map.get("VehicleType").getClass().equals(Integer.class)){
            VehicleType= (int) map.get("VehicleType");
            if(VehicleType!=2 && VehicleType!=3)
                return null;
//            map.remove("VehicleType");
        }
        else
            return null;

//        if(!map.isEmpty())
//            return null;
        System.out.println("entry4");
        return new Vehicle(Vehicleno,Owner);
//        if(VehicleType==2)
//            return  new TwoWheel(Vehicleno,Owner);
//        else
//            return new ThreeWheel(Vehicleno,Owner);
    }
}
