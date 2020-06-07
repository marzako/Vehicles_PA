package Vehicles.AirVehicles;

import Vehicles.Vehicles;

public abstract class AirVehicles implements Vehicles {

    @Override
    public String move () {
        return "fly!";
    }
}
