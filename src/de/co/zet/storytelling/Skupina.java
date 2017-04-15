package de.co.zet.storytelling;

/**
 * TODO Description HERE.
 */
public class Skupina implements NositelVeci, Pohyblivy {
    private String nazov;
    private Miesto miesto;

    public Skupina(String nazov) {
        this.nazov = nazov;
    }

    public Skupina popadali(Miesto kam) {
        return this;
    }

    @Override
    @Deprecated
    public NositelVeci malSoSebou(Vec vec) {
        return null;
    }

    public Skupina maliSoSebou(Vec vec) {
        malSoSebou(vec);
        return this;
    }

    @Override
    public Pohyblivy isielDo(Miesto kam) {
        this.miesto = kam;
        return this;
    }

    @Override
    public Miesto miesto() {
        return miesto;
    }
}
