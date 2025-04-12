import invoker.SmartHomeRemoteControl;

public class SmartHomeMain {
    public static void main(String[] args) {
        SmartHomeRemoteControl control = new SmartHomeRemoteControl();
        SmartHomeMenu menu = new SmartHomeMenu(control);
        menu.showMenu();
    }
}
