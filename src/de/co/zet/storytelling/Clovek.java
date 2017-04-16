package de.co.zet.storytelling;

import de.co.zet.storytelling.story_events.MoveEvent;

import java.util.ArrayList;

public class Clovek implements Pohyblivy, NositelVeci, Oslovitelny, SchopnyReci {
    private String meno;
    private Miesto miesto;

    public Clovek(String meno) {
        this.meno = meno;
    }

    public Clovek udrelKohoKamCim(Clovek koho, CastTela kam, PouzitelnyNaUder cim) {
        return this;
    }

    public Ludia s(Clovek kym) {
        ArrayList<Clovek> list = new ArrayList<>();
        list.add(this);
        list.add(kym);
        return new Ludia(list);
    }
    public Ludia s(Ludia viacerymi) {
        ArrayList<Clovek> list = new ArrayList<>();
        list.add(this);
        list.addAll(viacerymi);
        return new Ludia(list);
    }

    public Clovek zviazal(Muz jezis) {
        return this;
    }

    public String meno() {
        return meno;
    }

    @Override
    public Clovek isielDo(Miesto kam) {
        this.miesto = kam;
        notifyObservers(new MoveEvent(this, kam));
        return this;
    }

    @Override
    public Miesto miesto() {
        return this.miesto;
    }

    public Clovek saZohrieval(ZdrojTepla zdrojTepla) {
        return this;
    }
}
