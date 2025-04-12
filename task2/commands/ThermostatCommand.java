package commands;

import commandInterface.Command;
import devices.Thermostat;

public class ThermostatCommand implements Command { // Class for ThermostatCommand
    private final Thermostat thermostat;
    private final int temperature;

    public ThermostatCommand(Thermostat thermostat, int temperature) { // Constructor for ThermostatCommand (add thermostat and current temperature)
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() { // Change current temperature
        thermostat.setCurrentTemp(temperature);
    }

    @Override
    public void undo() { // Reverse previous temperatures
        thermostat.revertTemperature();
    }

}
