package configurate;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class AbstractSupportHandler implements SupportHandler{ // Abstract class which another class extending

    protected SupportHandler nextHandler; // Take next handler

    @Override
    public SupportHandler set_next(SupportHandler handler) { // Set next handler
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public List<String> getIssues() { // Return problems
        return Collections.emptyList();
    }
}
