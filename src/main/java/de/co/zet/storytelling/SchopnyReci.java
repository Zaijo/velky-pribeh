package de.co.zet.storytelling;

import de.co.zet.storytelling.observers.Observable;
import de.co.zet.storytelling.story_events.TalkEvent;

public interface SchopnyReci extends Observable {
    String meno();

    default SchopnyReci povedali(String slova) {
        notifyObservers(new TalkEvent(this, slova.toUpperCase()));
        return this;
    }

    default SchopnyReci povedal(String slova) {
        notifyObservers(new TalkEvent(this, slova));
        return this;
    }

    default SchopnyReci povedal(String slova, Oslovitelny komu) {
        notifyObservers(new TalkEvent(this, komu, slova));
        return this;
    }
}
