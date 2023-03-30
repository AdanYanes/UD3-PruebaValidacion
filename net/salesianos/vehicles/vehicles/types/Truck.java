package vehicles.vehicles.types;

import vehicles.vehicles.Vehicle;

public class Truck extends Vehicle{

    float maxCargoCapacity;

    public Truck(String brand, float weight, int power, int doorNumber, float maxCargoCapacity) {
        super(brand, weight, power, doorNumber);
        this.maxCargoCapacity = maxCargoCapacity;
        this.speed = 0;
    }
    @Override
    public void accelerate(){
        this.speed  += 5;
    }

    @Override
    public String toString(){
        String msg = "-------------------------------------------------------------------------------------------------";
        msg += "\n Tipo de vehículo: Camión";
        msg += "\n Marca: " + this.brand;
        msg += "\n Peso: " + this.weight + " kg";
        msg += "\n Potencia: " + this.power + " kW";
        msg += "\n Número de puertas: " + this.doorNumber;
        msg += "\n Capacidad de carga: " + this.maxCargoCapacity;
        msg += "\n Velocidad actual: " + this.speed + " km/h";
        msg += "\n -------------------------------------------------------------------------------------------------";

        return msg;
    }
}