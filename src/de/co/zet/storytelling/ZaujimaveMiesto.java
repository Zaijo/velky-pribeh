package de.co.zet.storytelling;


public class ZaujimaveMiesto implements Miesto {
    private String oznacenie;
    private Miesto umiestnenie;

    public ZaujimaveMiesto(String oznacenie) {
        this.oznacenie = oznacenie;
    }

    public ZaujimaveMiesto(String oznacenie, Miesto umiestnenie) {
        this.oznacenie = oznacenie;
        this.umiestnenie = umiestnenie;
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
