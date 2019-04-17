package de.co.zet.storytelling.story_events;

import de.co.zet.storytelling.Miesto;
import de.co.zet.storytelling.Pohyblivy;

public class MoveEvent extends StoryEvent {
    private Pohyblivy kto;
    private Miesto kam;

    public MoveEvent(Pohyblivy kto, Miesto kam) {
        this.kto = kto;
        this.kam = kam;
    }

    public String toString() {
        return String.format("-------- %s --------> %s", kto.meno(), targetLabel());
    }

    private String targetLabel() {
        StringBuilder sb = new StringBuilder();
        sb.append(kam.oznacenie());
        if(kam.umiestnenie() != null) {
            sb.append(String.format(" [%s]", kam.umiestnenie().oznacenie()));
        }
        return sb.toString();
    }
}
