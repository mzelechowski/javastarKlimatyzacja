package pl.nauka;

public class Room {
    private int number;
    private double currentTemperature;
    private double targetTemperature;
    private double volume;
    private AirConditioner airConditioner;

    public Room(int number, double currentTemperature, double targetTemperature, double volume, AirConditioner airConditioner){
        this.number = number;
        this.currentTemperature=currentTemperature;
        this.targetTemperature=targetTemperature;
        this.volume=volume;
        this.airConditioner=airConditioner;
    }


    public double getCurrentTemperature() {
        return currentTemperature;
    }


    public double getTargetTemperature() {
        return targetTemperature;
    }










    public void cool(){
        if(currentTemperature>targetTemperature)
            currentTemperature= airConditioner.lowerTemperature(currentTemperature, volume);
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", currentTemperature=" + String.format("%.2f", currentTemperature) +
                ", targetTemperature=" + targetTemperature +
                ", volume=" + volume +
                ", airConditioner=" + airConditioner +
                '}';
    }
}
