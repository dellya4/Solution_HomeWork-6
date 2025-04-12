package commands;
import devices.Light;
import commandInterface.Command;

public class LightCommand implements Command{
    private final Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
