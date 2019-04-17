package de.co.zet.storytelling;

import de.co.zet.storytelling.observers.Observable;

/**
 * TODO Description HERE.
 */
public interface Pohyblivy extends Observable {
    Pohyblivy isielDo(Miesto kam);

    Miesto miesto();

    String meno();

    default Pohyblivy islaDo(Miesto kam) {
        isielDo(kam);
        return this;
    }

    default Pohyblivy isliDo(Miesto kam) {
        isielDo(kam);
        return this;
    }
}
