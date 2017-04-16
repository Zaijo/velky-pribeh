package de.co.zet.storytelling;

public class Terc implements Miesto {
    private Miesto umiestnenie;

    public Terc(Miesto umiestnenie) {
        this.umiestnenie = umiestnenie;
    }

    @Override
    public String oznacenie() {
        return "Terc";
    }

    @Override
    public Miesto umiestnenie() {
        return umiestnenie;
    }

    public String toString() {
        return oznacenie();
    }
}
