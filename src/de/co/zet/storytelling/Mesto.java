package de.co.zet.storytelling;

/**
 * TODO Description HERE.
 */
public class Mesto implements Miesto {
    private String nazov;

    public Mesto(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public String oznacenie() {
        return nazov;
    }

    @Override
    public String toString() {
        return nazov;
    }
}
