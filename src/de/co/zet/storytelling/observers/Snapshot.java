package de.co.zet.storytelling.observers;

import de.co.zet.storytelling.Miesto;
import de.co.zet.storytelling.Pohyblivy;
import de.co.zet.storytelling.story_events.StoryEvent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Keeps information about all individual "situations" on the map like movie frames.
 */
public class Snapshot implements StoryEventsObserver {
    HashSet<Miesto> miesta = new HashSet<>();
    HashSet<Pohyblivy> pohybliveObjekty = new HashSet<>();


    @Override

    public void update(StoryEvent event) {

    }
}
