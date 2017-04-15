package de.co.zet.storytelling;

public class Budova implements Miesto {
    private String oznacenie;

    public Budova(String oznacenie) {
        this.oznacenie = oznacenie;
    }

    @Override
    public String oznacenie() {
        return oznacenie;
    }
}
