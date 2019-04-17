package de.co.zet.storytelling.observers;

import de.co.zet.storytelling.story_events.StoryEvent;

import java.util.HashSet;
import java.util.Set;

public interface Observable {
    HashSet<StoryEventsObserver> observers = new HashSet<>();

    default void addObserver(StoryEventsObserver o) {
        observers.add(o);
    }

    default void notifyObservers(StoryEvent event) {
        observers.forEach((o) -> o.update(event));
    }
}
