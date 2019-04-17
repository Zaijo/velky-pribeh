package de.co.zet.storytelling;

/**
 * Inspisovane Annasovym domom z Jn 18
 */
public class DomSNadvorim extends Budova {
    private Miesto nadvorie;
    private Miesto vstupneDvere;
    private Miesto domSamotny;

    private DomSNadvorim(String oznacenie) {
        super(oznacenie);
    }

    private void setNadvorie(Miesto nadvorie) {
        this.nadvorie = nadvorie;
    }

    private void setVstupneDvere(Miesto vstupneDvere) {
        this.vstupneDvere = vstupneDvere;
    }

    private void setDomSamotny(Miesto domSamotny) {
        this.domSamotny = domSamotny;
    }

    public Miesto nadvorie() {
        return nadvorie;
    }

    public Miesto vstupneDvere() {
        return vstupneDvere;
    }

    public Miesto domSamotny() {
        return domSamotny;
    }

    static class DomVelknazaBuilder {
        DomSNadvorim dom;
        private Miesto nadvorie;
        private Miesto vstupneDvere;
        private Miesto domSamotny;

        DomVelknazaBuilder(String oznacenie) {
            dom = new DomSNadvorim(oznacenie);
        }

        DomVelknazaBuilder maNadvorie(Miesto nadvorie) {
            dom.setNadvorie(nadvorie);
            return this;
        }

        DomVelknazaBuilder maVstupneDvere(Miesto vstupneDvere) {
            dom.setVstupneDvere(vstupneDvere);
            return this;
        }

        DomVelknazaBuilder maDomSamotny(Miesto domSamotny) {
            dom.setDomSamotny(domSamotny);
            return this;
        }

        DomSNadvorim build() {
            return dom;
        }
    }
}
