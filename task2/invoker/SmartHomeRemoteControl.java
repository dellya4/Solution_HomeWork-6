package invoker;

import commandInterface.Command;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl { // Class for SmartHomeRemoteControl
    private final Map<String, Command> slots = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String slot, Command command) { // Function which set command
        slots.put(slot, command);
    }

    public void pressButton(String slot) { // Function which call function which make current action and save last action
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("This slot is empty");
        }
    }

    public void undoButton() { // Function which canceling last action
        if (lastCommand != null) {
            System.out.println("Undo last command");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
