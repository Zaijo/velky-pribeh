package de.co.zet.storytelling;

import java.util.ArrayList;

public class Clovek implements Pohyblivy, NositelVeci, Oslovitelny {
    private String meno;
    private Miesto miesto;

    public Clovek(String meno) {
        this.meno = meno;
    }

    public Clovek hovori(String slova, Oslovitelny komu) {
        System.out.println(meno + " -> " + komu.meno() + ": " + slova);
        return this;
    }

    public Clovek hovori(String slova) {
        System.out.println(meno + ": " + slova);
        return this;
    };

    public Clovek povedal(String slova, Oslovitelny komu) {
        hovori(slova, komu);
        return this;
    }

    public Clovek povedal(String slova) {
        hovori(slova);
        return this;
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
