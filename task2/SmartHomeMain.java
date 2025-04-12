import invoker.SmartHomeRemoteControl;

public class SmartHomeMain {
    public static void main(String[] args) {
        SmartHomeRemoteControl control = new SmartHomeRemoteControl(); // Create control
        SmartHomeMenu menu = new SmartHomeMenu(control); // Create menu and adding control
        menu.showMenu(); // Run the program
    }
}
