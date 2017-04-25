package de.co.zet.storytelling.observers;

import de.co.zet.storytelling.story_events.StoryEvent;
import de.co.zet.storytelling.story_events.TalkEvent;

import java.io.IOException;

import static java.lang.Runtime.getRuntime;
import static java.lang.String.format;

/**
 * Uses system "say -v Laura" command to talk.
 */
public class Speech implements StoryEventsObserver {

    @Override
    public void update(StoryEvent event) {
        if (event instanceof TalkEvent) {
            TalkEvent talkEvent = (TalkEvent) event;
            try {
                Process process = getRuntime().exec(
                        format("say -v Laura \"%s\"",
                                talkEvent.toSpeech().toLowerCase().replaceAll("\"", "")));
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
