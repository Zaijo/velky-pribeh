package de.co.zet.storytelling;

import de.co.zet.storytelling.DomSNadvorim.DomVelknazaBuilder;

public class Main {

    public static void main(String[] args) {
        Skupina ucenici = new Skupina("Ucenici");
        Muz jezis = new Muz("Jezis");
        Miesto getsemani = () -> "Zahrada za potokom Cedron";
        jezis.isielDo(getsemani);
        Ludia vojaci = new Ludia("Vojaci")
                .maliSoSebou(new Lampas())
                .maliSoSebou(new Fakla())
                .maliSoSebou(new Zbran());
        vojaci.isliDo(getsemani);
        jezis.povedal("Koho hladate?", vojaci);
        vojaci.povedali("Jezisa Nazaretskeho!");
        jezis.povedal("Ja som!", vojaci);
        vojaci.popadali(() -> "Zem");

        jezis.povedal("Koho hladate?", vojaci);
        vojaci.povedali("Jezisa Nazaretskeho!");
        jezis.povedal("Povedal som vám: Ja som. Keď teda mňa hľadáte, týchto nechajte odísť!", vojaci);

        Muz simonPeter = new Muz("Šimon Peter");
        Muz malchus = new Muz("Malchus");
        Mec petrovMec = new Mec();
        simonPeter.malSoSebou(petrovMec).vytiahol(petrovMec).pouzil(petrovMec, malchus);
        jezis.povedal("Schovaj meč do pošvy! Azda nemám piť kalich, ktorý mi dal Otec?!");
        DomSNadvorim annasovhoDomu = new DomVelknazaBuilder("Annasov dom")
                .maVstupneDvere(new ZaujimaveMiesto("Vstupne dvere"))
                .maNadvorie(new ZaujimaveMiesto("Nadvorie"))
                .maDomSamotny(new ZaujimaveMiesto("Vnutorny Annasov dom"))
                .build();
        vojaci.chytili(jezis).zviazali(jezis).isliDo(annasovhoDomu);
        jezis.isielDo(annasovhoDomu);

        Muz jan = new Muz("Jan");
        simonPeter.isielDo(annasovhoDomu.vstupneDvere());
        jan.isielDo(annasovhoDomu.nadvorie());

        Zena vratnicka = new Zena("Vratnicka domu");
        jan.povedal("", vratnicka);
        jan.isielDo(annasovhoDomu.vstupneDvere());
        jan.s(simonPeter).isliDo(annasovhoDomu.nadvorie());

        vratnicka.povedal("Nie si aj ty z učeníkov toho človeka?", simonPeter);
        Ohnisko ohen = new Ohnisko("Ohen na nadvori", annasovhoDomu.nadvorie());
        simonPeter.povedal("Nie som.", vratnicka);

        new Pocasie(annasovhoDomu).bolo("chladno");
        simonPeter.isielDo(ohen).saZohrieval(ohen);

        Velknaz annas = new Velknaz("Annas");
        annas.povedal("Ake je tvoje ucenie? A co tvoji ucenici?", jezis);
        jezis.povedal("Ja som verejne hovoril svetu. Vždy som učil v synagóge a v chráme, kde sa schádzajú " +
                "všetci Židia, a nič som nehovoril tajne. Prečo sa pýtaš mňa? Opýtaj sa tých, ktorí počuli, čo " +
                "som im hovoril! Oni vedia, čo som hovoril.", annas);
        Muz sluha = new Muz("Annasov sluha");
        sluha.udrelKohoKamCim(jezis, CastTela.TVAR, CastTela.RUKA).povedal("Tak odpovedáš veľkňazovi?", jezis);
        jezis.povedal("Ak som zle povedal, dokáž, čo bolo zlé, ale ak dobre, prečo ma biješ?!", sluha);

        Muz annasovVojak = new Muz("Annasov vojak");
        DomSNadvorim kajfasovDom = new DomVelknazaBuilder("Kajfasov dom").build();
        annasovVojak.zviazal(jezis).s(jezis).isliDo(kajfasovDom);

        simonPeter.saZohrieval(ohen);
        Ludia ludiaPriOhni = new Ludia("ludia pri ohni");
        ludiaPriOhni.povedali("Nie si aj ty z jeho učeníkov?");
        simonPeter.povedal("Nie som.");
        Muz malchusovPribuzny = new Muz("Malchusov pribuzny");
        malchusovPribuzny.povedal("A nevidel som ťa s ním v záhrade?!", simonPeter);
        simonPeter.povedal("Nie som.");
        new Kohut().zaspieval();


    }
}
