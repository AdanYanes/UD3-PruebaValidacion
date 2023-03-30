package vehicles.vehicles.types;

import vehicles.vehicles.Vehicle;

public class Moped extends Vehicle{

    private boolean isAbleInHighways;

    public Moped(String brand, float weight, int power, int doorNumber, boolean isAbleInHighways) {
        super(brand, weight, power, doorNumber);
        this.isAbleInHighways = isAbleInHighways;
        this.speed = 0;
    }
    
    @Override
    public void accelerate(){
        this.speed  += 7;
    }

    @Override
    public String toString(){
        String msg = "-------------------------------------------------------------------------------------------------";
        msg += "\n Tipo de vehículo: Ciclomotor";
        msg += "\n Marca: " + this.brand;
        msg += "\n Peso: " + this.weight + " kg";
        msg += "\n Potencia: " + this.power + " kW";
        msg += "\n Número de puertas: " + this.doorNumber;
        msg += "\n Puede ir por autopista: " + (isAbleInHighways?"Si":"No");
        msg += "\n Velocidad actual: " + this.speed + " km/h";
        msg += "\n -------------------------------------------------------------------------------------------------";

        return msg;
    }
}
