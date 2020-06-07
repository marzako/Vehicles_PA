package Vehicles.WaterVehicles;

import Vehicles.Vehicles;

public  abstract class WaterVehicles implements Vehicles {

    @Override
    public String move() {
        return "moves on the water!";
    }
}
