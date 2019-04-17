package de.co.zet.storytelling;

public class Zahrada implements Miesto {
    private Miesto umiestnenie;

    public Zahrada(String oznacenie) {
    }

    @Override
    public String oznacenie() {
        return null;
    }

    @Override
    public Miesto umiestnenie() {
        return umiestnenie;
    }
}
