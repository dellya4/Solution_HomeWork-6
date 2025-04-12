package commands;

import commandInterface.Command;
import devices.SmartSpeaker;

public class PlayMusicCommand implements Command { // Class for PlayMusicCommand
    private final SmartSpeaker speaker;

    public PlayMusicCommand(SmartSpeaker speaker) { // Constructor for PlayMusicCommand (add speaker)
        this.speaker = speaker;
    }

    @Override
    public void execute() { // Function which playing music
        speaker.playMusic();
    }

    @Override
    public void undo() { // Function which stopping music
        speaker.stopMusic();
    }
}
