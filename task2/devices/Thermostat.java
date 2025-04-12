package devices;

public class Thermostat { // Class for Thermostat
    private int currentTemp;
    private int previousTemp;

    public int getCurrentTemp() { // Return current temperature
        return currentTemp;
    }

    public void setCurrentTemp(int temperature) { // Change current temperature
        previousTemp = currentTemp;
        currentTemp = temperature;
        System.out.println("[Thermostat] Setting temperature: " + currentTemp);
    }

    public void revertTemperature() { // Reverse previous temperatures
        System.out.println("[Thermostat] Setting to previous temperature: " + previousTemp);
        currentTemp = previousTemp;
    }
}
