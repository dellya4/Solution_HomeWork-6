package commands;

import commandInterface.Command;
import devices.SmartSpeaker;

public class PlayMusicCommand implements Command {
    private final SmartSpeaker speaker;

    public PlayMusicCommand(SmartSpeaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.playMusic();
    }

    @Override
    public void undo() {
        speaker.stopMusic();
    }
}
