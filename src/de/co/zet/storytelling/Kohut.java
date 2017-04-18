package de.co.zet.storytelling;

import de.co.zet.storytelling.observers.Observable;
import de.co.zet.storytelling.story_events.TalkEvent;

public class Kohut implements Observable, SchopnyReci{
    Kohut zaspieval() {
        notifyObservers(new TalkEvent(this, "Kikirikí"));
        return this;
    }

    @Override
    public String meno() {
        return "Kohút";
    }
}
