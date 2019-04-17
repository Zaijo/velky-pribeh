package de.co.zet.storytelling;

public class Zahrada implements Miesto {
    private final String oznacenie;
    private Miesto umiestnenie;

    public Zahrada(String oznacenie) {
        this.oznacenie = oznacenie;
    }

    @Override
    public String oznacenie() {
        return oznacenie;
    }

    @Override
    public Miesto umiestnenie() {
        return umiestnenie;
    }
}
