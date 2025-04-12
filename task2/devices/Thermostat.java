package devices;

public class Thermostat {
    private int currentTemp;
    private int previousTemp;

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int temperature) {
        previousTemp = currentTemp;
        currentTemp = temperature;
        System.out.println("[Thermostat] Setting temperature: " + currentTemp);
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Setting to previous temperature: " + previousTemp);
        currentTemp = previousTemp;
    }
}
