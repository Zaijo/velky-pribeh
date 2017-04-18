package de.co.zet.storytelling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Ludia extends ArrayList<Clovek> implements Pohyblivy, SchopnyReci, NositelVeci, Oslovitelny {
    private String oznacenie;
    private String menoDativ;
    private Miesto miesto;

    public Ludia(String oznacenie, String menoDativ) {
        this.oznacenie = oznacenie;
        this.menoDativ = menoDativ;
    }

    public Ludia popadali(Miesto kam) {
        return this;
    }

    @Override
    @Deprecated
    public NositelVeci malSoSebou(Vec vec) {
        return null;
    }

    public Ludia maliSoSebou(Vec vec) {
        malSoSebou(vec);
        return this;
    }

    public Ludia(Collection<? extends Clovek> c) {
        super(c);
    }

    public Ludia s(Clovek kym) {
        this.add(kym);
        return this;
    }

    public Ludia s(Ludia viacerymi) {
        this.addAll(viacerymi);
        return this;
    }

    public Stream<Clovek> publishedStream() {
        return this.stream();
    }

    public Ludia chytili(Clovek koho) {
        return this;
    }

    public Ludia zviazali(Clovek koho) {
        return this;
    }

    public Ludia bicovali(Clovek koho) {
        return this;
    }

    @Override
    @Deprecated
    public Pohyblivy isielDo(Miesto kam) {
        this.miesto = miesto;
        this.publishedStream().forEach((pohyblivy)-> pohyblivy.isielDo(kam));
        return this;
    }

    @Override
    public Miesto miesto() {
        return miesto;
    }

    @Override
    public String meno() {
        return oznacenie;
    }

    @Override
    public String menoDativ() {
        return menoDativ;
    }
}
