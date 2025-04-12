package handlers;

import configurate.AbstractSupportHandler;

import java.util.List;

public class FAQBotHandler extends AbstractSupportHandler { // Class for FAQBotHandler

    @Override
    public void handle(String issue) { // Print solve of problem
        if (issue.equals("password_reset")) { // Check problem
            System.out.println("[FAQBot] Handled password_reset");
        } else if (nextHandler != null) { // Transfer problem to next Handler
            nextHandler.handle(issue);
        } else { // Print that last Handle cannot solve this problem
            System.out.println("[FAQBot] Cannot handle " + issue);
        }
    }

    @Override // Add problem which can solve FAQBotHandler
    public List<String> getIssues() {
        return List.of("password_reset");
    }
}
