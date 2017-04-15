package de.co.zet.storytelling;

/**
 * TODO Description HERE.
 */
public interface Pohyblivy {
    Pohyblivy isielDo(Miesto kam);

    Miesto miesto();

    default Pohyblivy islaDo(Miesto kam) {
        isielDo(kam);
        return this;
    }

    default Pohyblivy isliDo(Miesto kam) {
        isielDo(kam);
        return this;
    }
}
