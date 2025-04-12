import commandInterface.Command;
import commands.*;
import devices.*;
import invoker.SmartHomeRemoteControl;
import java.util.Scanner;

public class SmartHomeMenu {
    private final SmartHomeRemoteControl control;
    private final Thermostat thermostat;

    public SmartHomeMenu(SmartHomeRemoteControl control) {
        this.control = control;
        thermostat = new Thermostat();
        Light light = new Light();
        SmartSpeaker speaker = new SmartSpeaker();

        thermostat.setCurrentTemp(25);
        control.setCommand("A", new LightCommand(light));
        control.setCommand("B", new ThermostatCommand(thermostat, 25));
        control.setCommand("C", new PlayMusicCommand(speaker));
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Smart Home — Remote control ===");
        System.out.println("Select an action:");
        System.out.println("  1 — Turn on the light");
        System.out.println("  2 — Set the temperature");
        System.out.println("  3 — Turn on the music");
        System.out.println("  undo — Undo the last action");
        System.out.println("  exit");
        System.out.println("====================================");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "1":
                    control.pressButton("A");
                    break;
                case "2":
                    System.out.println("Current temperature: " + thermostat.getCurrentTemp());
                    System.out.print("Input temperature: ");
                    try {
                        int temp = Integer.parseInt(scanner.nextLine());
                        Command setTemp = new ThermostatCommand(thermostat, temp);
                        control.setCommand("B", setTemp);
                        control.pressButton("B");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid temperature!");
                    }
                    break;
                case "3":
                    control.pressButton("C");
                    break;
                case "undo":
                    control.undoButton();
                    break;
                case "exit":
                    System.out.println("=== Smart Home — Remote control ===");
                    System.out.println("Completion of work. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }
    }
}
