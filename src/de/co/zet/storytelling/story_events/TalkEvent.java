package de.co.zet.storytelling.story_events;

import de.co.zet.storytelling.Oslovitelny;
import de.co.zet.storytelling.SchopnyReci;

public class TalkEvent extends StoryEvent {
    private SchopnyReci kto;
    private Oslovitelny komu;
    private String slova;
    private Type typ;

    public TalkEvent(SchopnyReci kto, Oslovitelny komu, String slova) {
        this.kto = kto;
        this.komu = komu;
        this.slova = slova;
        this.typ = Type.ADRESOVANY;
    }

    public TalkEvent(SchopnyReci kto, String slova) {
        this.kto = kto;
        this.slova = slova;
        this.typ = Type.DO_VETRA;
    }

    public String toString() {
        switch (typ) {
            case ADRESOVANY:
                return String.format("[%s -> %s]: %s", kto.meno(), komu.meno(), slova);
            default:
                return String.format("[%s]: %s", kto.meno(), slova);
        }
    }

    enum Type {
        ADRESOVANY,
        DO_VETRA
    }
}
