package handlers;

import configurate.AbstractSupportHandler;

import java.util.List;

public class JuniorSupportHandler extends AbstractSupportHandler { // Class for JuniorSupportHandler

    @Override
    public void handle(String issue) { // Print solve of problem
        if (issue.equals("refund_request") || issue.equals("billing_issue")) { // Check problems
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) { // Transfer problem to next Handler
            nextHandler.handle(issue);
        } else { // Print that last Handle cannot solve this problem
            System.out.println("[JuniorSupport] Cannot handle " + issue);
        }
    }

    @Override // Add problem which can solve JuniorSupport
    public List<String> getIssues() {
        return List.of("refund_request", "billing_issue");
    }
}
