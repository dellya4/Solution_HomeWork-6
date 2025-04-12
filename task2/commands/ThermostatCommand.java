package commands;

import commandInterface.Command;
import devices.Thermostat;

public class ThermostatCommand implements Command {
    private final Thermostat thermostat;
    private final int temperature;

    public ThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setCurrentTemp(temperature);
    }

    @Override
    public void undo() {
        thermostat.revertTemperature();
    }

}
