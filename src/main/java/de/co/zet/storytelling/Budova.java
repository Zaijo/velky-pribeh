package de.co.zet.storytelling;

public class Budova implements Miesto {
    private String oznacenie;
    private Miesto umiestnenie;

    public Budova(String oznacenie) {
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
