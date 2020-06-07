package Vehicles.LandVehicles;

import Vehicles.Vehicles;

public abstract class LandVehicles implements Vehicles {

    @Override
    public String move () {
        return "moves on the wheels!";
    }
}
