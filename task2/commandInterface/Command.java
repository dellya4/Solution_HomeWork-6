package commandInterface;

public interface Command { // Interface for command
    void execute(); // Function which turn/change conditional device
    void undo(); // Function which cancel last action
}
