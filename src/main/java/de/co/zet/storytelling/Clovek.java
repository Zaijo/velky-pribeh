package de.co.zet.storytelling;

import de.co.zet.storytelling.story_events.MoveEvent;

import java.util.ArrayList;

public class Clovek implements Pohyblivy, NositelVeci, Oslovitelny, SchopnyReci {
    private String meno;
    private String menoDativ;
    private Miesto miesto;

    public Clovek(String meno, String menoDativ) {
        this.meno = meno;
        this.menoDativ = menoDativ;
    }

    public Clovek udrelKohoKamCim(Clovek koho, CastTela kam, PouzitelnyNaUder cim) {
        return this;
    }

    public Ludia s(Clovek kym) {
        ArrayList<Clovek> list = new ArrayList<>();
        list.add(this);
        list.add(kym);
        return new Ludia(
            String.format("%s a %s", meno(), kym.meno()), // TODO duplicita s triedou Ludia
            String.format("%s a %s", menoDativ(), kym.menoDativ()),
            list);
    }
    public Ludia s(Ludia viacerymi) {
        ArrayList<Clovek> list = new ArrayList<>();
        list.add(this);
        list.addAll(viacerymi);
        return new Ludia(
            String.format("%s a ďalší", meno()), // TODO duplicita s triedou Ludia
            String.format("%s a ďalším", menoDativ()),
            list);
    }

    public Clovek zviazal(Muz jezis) {
        return this;
    }

    public String meno() {
        return meno;
    }

    @Override
    public String menoDativ() {
        return menoDativ;
    }

    @Override
    public Clovek isielDo(Miesto kam) {
        this.miesto = kam;
        notifyObservers(new MoveEvent(this, kam));
        return this;
    }

    @Override
    public Clovek malSoSebou(Vec vec) {
        return this;
    }

    public Predmet vyrobilPredmet(String nazov) {
        return new Predmet(nazov);
    }

    public Clovek dal(Vec co, Clovek komu) {
        return this;
    }

    public Clovek saZlakol() {
        return this.dostal(Pocit.STRACH);
    }

    public Clovek dostal(Pocit pocit) {
        return this;
    }

    @Override
    public Miesto miesto() {
        return this.miesto;
    }

    public Clovek saZohrieval(ZdrojTepla zdrojTepla) {
        return this;
    }

    public Clovek bol(Miesto kde) {
        this.miesto = kde;
        return this;
    }

    public Clovek siSadol(MiestoNaSedenie miestoNaSedenie) {
        return this;
    }

    /**
     * Netypické volanie špecifické pre evanjelium, alebo iné texty s mučením
     */
    public Clovek pribil(Clovek koho, Predmet kam) {
        return this;
    }

    public Clovek pribil(Predmet co, Predmet kam) {
        return this;
    }

    public Telo zomrel() {
        return new Telo(this);
    }
}
