package de.co.zet.storytelling;

/**
 * TODO Description HERE.
 */
public class Mesto implements Miesto {
    private String nazov;
    private Miesto umiestnenie;

    public Mesto(String nazov) {
        this.nazov = nazov;
    }

    public Mesto(String nazov, Miesto umiestnenie) {
        this.nazov = nazov;
        this.umiestnenie = umiestnenie;
    }

    @Override
    public String oznacenie() {
        return nazov;
    }

    @Override
    public Miesto umiestnenie() {
        return umiestnenie;
    }

    @Override
    public String toString() {
        return nazov;
    }
}
