package handlers;

import configurate.AbstractSupportHandler;

import java.util.List;

public class SeniorSupportHandler extends AbstractSupportHandler { // Class for SeniorSupportHandler

    @Override
    public void handle(String issue) { // Print solve of problem
        if (issue.equals("account_ban") || issue.equals("data_loss")) { // Check problems
            System.out.println("[SeniorHandler] Handled " + issue);
        } else if (nextHandler != null) { // Transfer problem to next Handler
            nextHandler.handle(issue);
        } else { // Print that last Handle cannot solve this problem
            System.out.println("[SeniorHandler] Cannot handle " + issue);
        }
    }

    @Override // Add problem which can solve SeniorSupport
    public List<String> getIssues() {
        return List.of("account_ban", "data_loss");
    }
}
