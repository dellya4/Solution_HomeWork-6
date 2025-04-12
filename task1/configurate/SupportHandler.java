package configurate;

import java.util.List;

public interface SupportHandler { // Interface for SupportHandler

    SupportHandler set_next(SupportHandler handler); // Function which set next handler
    void handle(String issue); // Function which print which problem Handler solves
    List<String> getIssues(); // Function which print which Handler can solve which problems
}
