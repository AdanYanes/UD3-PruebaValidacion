package vehicles;

import vehicles.vehicles.types.Moped;
import vehicles.vehicles.types.Truck;

public class MainVehicles {
    public static void main(String[] args) {

        Truck camion = new Truck("Volvo", 6000f, 300, 2, 500);

        Moped ciclomotor = new Moped("Volvo", 6000f, 300, 2, true);


        camion.accelerate();

        System.out.println(camion.toString());
        
        ciclomotor.accelerate();

        System.out.println(ciclomotor.toString());
    }
}
