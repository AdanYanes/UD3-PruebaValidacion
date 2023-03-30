package vehicles.vehicles;

public class Vehicle {
    
    protected String brand;
    protected float weight;
    protected int power;
    protected int doorNumber;
    protected int speed;

    public Vehicle(String brand, float weight, int power, int doorNumber){
        this.brand = brand;
        this.weight = weight;
        this.power = power;
        this.doorNumber = doorNumber;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getDoorNumber() {
        return doorNumber;
    }
    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void accelerate(){
        this.speed += 10;
    }
}
