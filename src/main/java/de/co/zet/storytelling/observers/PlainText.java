package de.co.zet.storytelling.observers;

import de.co.zet.storytelling.story_events.MoveEvent;
import de.co.zet.storytelling.story_events.StoryEvent;
import de.co.zet.storytelling.story_events.TalkEvent;

public class PlainText implements StoryEventsObserver {
    @Override
    public void update(StoryEvent event) {
        if (event instanceof TalkEvent) {
            System.out.println("PLAINTEXT: " + event);
        }
        if (event instanceof MoveEvent) {
            System.out.println("PLAINTEXT: " + event);
        }
    }
}
