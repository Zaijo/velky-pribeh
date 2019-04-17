package de.co.zet.storytelling.observers;

import de.co.zet.storytelling.story_events.StoryEvent;

public interface StoryEventsObserver {
    void update(StoryEvent event);
}
