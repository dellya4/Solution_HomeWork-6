package commands;
import devices.Light;
import commandInterface.Command;

public class LightCommand implements Command{ // Class for LightCommand
    private final Light light;

    public LightCommand(Light light) { // Constructor for LightCommand (add light)
        this.light = light;
    }

    @Override
    public void execute() { // // Function which turn on light
        light.turnOn();
    }

    @Override
    public void undo() { // Function which turn off light
        light.turnOff();
    }
}
