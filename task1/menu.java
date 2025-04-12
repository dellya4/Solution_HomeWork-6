import java.util.Scanner;
import java.util.List;

import configurate.SupportHandler;

public class menu { // Class for menu
    private final SupportHandler supportHandler;
    private final List<SupportHandler> allHandlers;

    public menu(SupportHandler supportHandler, List <SupportHandler> allHandlers) { // Constructor for menu
        this.supportHandler = supportHandler;
        this.allHandlers = allHandlers;
    }

    public void run() { // Function which connect all program
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Support Center 'Yesterday's breakfast' ===:");
        System.out.println("Supported queries:");
        printIssues();

        while (true) { // Loop for taking several inputs
            System.out.print("> ");
            String problem = scanner.nextLine();
            if (problem.equalsIgnoreCase("exit")) {
                System.out.println("=== Thank you for contacting us! We hope we helped you solve the problem. " +
                        "Please contact again the Support Center 'Yesterday's breakfast' ===");
                break;
            }
            supportHandler.handle(problem);
        }
    }

    private void printIssues() { // Print all problems
        for (SupportHandler handler : allHandlers) {
            List<String> issues = handler.getIssues();
            if (!issues.isEmpty()) {
                System.out.printf("  '%s' %s%n", handler.getClass().getSimpleName(), String.join(", ", issues));
            }
        }
    }

}
