package handlers;

import configurate.AbstractSupportHandler;

public class SeniorSupportHandler extends AbstractSupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorHandler] Handled " + issue);
        } else {
            System.out.println("[SeniorHandler] Cannot handle " + issue);
        }
    }
}
