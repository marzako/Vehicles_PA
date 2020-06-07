package Vehicles;


import Vehicles.AirVehicles.AirVehicles;
import Vehicles.AirVehicles.Heli;
import Vehicles.LandVehicles.FamilyCar;
import Vehicles.LandVehicles.LandVehicles;
import Vehicles.LandVehicles.Truck;
import Vehicles.WaterVehicles.MotorBoat;
import Vehicles.WaterVehicles.WaterVehicles;

public class Main {
    public static void main (String[] args) {
        AirVehicles Heli = new Heli();

        LandVehicles FamilyCar = new FamilyCar();
        LandVehicles Truck = new Truck();

        WaterVehicles MotorBoat = new MotorBoat();

        System.out.println("Heli`s move is " + Heli.move());
        System.out.println("Heli makes sound " + Heli.sound());

        System.out.println("Family car " + FamilyCar.move());
        System.out.println("Family car makes sound " + FamilyCar.sound());

        System.out.println("Truck" + Truck.move());
        System.out.println("Truck makes sound " + Truck.sound());

        System.out.println("Motor boat " + MotorBoat.move());
        System.out.println("Motor boat makes sound " + MotorBoat.sound());
    }
}
