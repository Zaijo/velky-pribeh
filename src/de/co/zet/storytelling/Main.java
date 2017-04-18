package de.co.zet.storytelling;

import de.co.zet.storytelling.DomSNadvorim.DomVelknazaBuilder;
import de.co.zet.storytelling.observers.PlainText;
import de.co.zet.storytelling.observers.Speech;

public class Main {

    public static void main(String[] args) {
        Skupina ucenici = new Skupina("Ucenici");
        Muz jezis = new Muz("Ježiš", "Ježišovi");
        jezis.addObserver(new PlainText());
        jezis.addObserver(new Speech());

        Miesto getsemani = new Zahrada("Getsemani");
        jezis.isielDo(getsemani);
        Ludia vojaci = new Ludia("Vojaci", "Vojakom")
                .maliSoSebou(new Lampas())
                .maliSoSebou(new Fakla())
                .maliSoSebou(new Zbran());
        vojaci.isliDo(getsemani);
        jezis.povedal("Koho hľadáte?", vojaci);
        vojaci.povedali("Ježiša Nazaretského!");
        jezis.povedal("Ja som!", vojaci);
        vojaci.popadali(new ZaujimaveMiesto("zem"));

        jezis.povedal("Koho hľadáte?", vojaci);
        vojaci.povedali("Ježiša Nazaretského!");
        jezis.povedal("Povedal som vám: Ja som. Keď teda mňa hľadáte, týchto nechajte odísť!", vojaci);

        Muz simonPeter = new Muz("Šimon Peter", "Šimonovi Petrovi");
        Muz malchus = new Muz("Malchus", "Malchusovi");
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

        Muz jan = new Muz("Jan", "Jánovi");
        simonPeter.isielDo(annasovhoDomu.vstupneDvere());
        jan.isielDo(annasovhoDomu.nadvorie());

        Zena vratnicka = new Zena("Vrátnička domu", "Vrátničke domu");
        jan.povedal("", vratnicka);
        jan.isielDo(annasovhoDomu.vstupneDvere());
        jan.s(simonPeter).isliDo(annasovhoDomu.nadvorie());

        vratnicka.povedal("Nie si aj ty z učeníkov toho človeka?", simonPeter);
        Ohnisko ohen = new Ohnisko("Ohen na nadvori", annasovhoDomu);
        simonPeter.povedal("Nie som.", vratnicka);

        new Pocasie(annasovhoDomu).bolo("chladno");
        simonPeter.isielDo(ohen).saZohrieval(ohen);

        Velknaz annas = new Velknaz("Annáš", "Annášovi");
        annas.povedal("Aké je tvoje učenie? A čo tvoji učeníci?", jezis);
        jezis.povedal("Ja som verejne hovoril svetu. Vždy som učil v synagóge a v chráme, kde sa schádzajú " +
                "všetci Židia, a nič som nehovoril tajne. Prečo sa pýtaš mňa? Opýtaj sa tých, ktorí počuli, čo " +
                "som im hovoril! Oni vedia, čo som hovoril.", annas);
        Muz sluha = new Muz("Annášov sluha", "Annášovmu sluhovi");
        sluha.udrelKohoKamCim(jezis, CastTela.TVAR, CastTela.RUKA).povedal("Tak odpovedáš veľkňazovi?", jezis);
        jezis.povedal("Ak som zle povedal, dokáž, čo bolo zlé, ale ak dobre, prečo ma biješ?!", sluha);

        Muz annasovVojak = new Muz("Annasov vojak", "Annášovmu vojakovi");
        DomSNadvorim kajfasovDom = new DomVelknazaBuilder("Kajfasov dom").build();
        annasovVojak.zviazal(jezis).s(jezis).isliDo(kajfasovDom);

        simonPeter.saZohrieval(ohen);
        Ludia ludiaPriOhni = new Ludia("ludia pri ohni", "Ľuďom pri ohni");
        ludiaPriOhni.povedali("Nie si aj ty z jeho učeníkov?");
        simonPeter.povedal("Nie som.");
        Muz malchusovPribuzny = new Muz("Malchusov pribuzny", "Malchusovmu príbuznému");
        malchusovPribuzny.povedal("A nevidel som ťa s ním v záhrade?!", simonPeter);
        simonPeter.povedal("Nie!");
        new Kohut().zaspieval();

        Miesto vladnaBudova = new Budova("Vladna budova");
        Miesto predVladnouBudovou = new ZaujimaveMiesto("Pred vladnou budovou");
        // TODO bolo uz rano
        Ludia velknaziAZakonnici = new Ludia("Veľkňazi a zákonníci", "Židom");
        annasovVojak.s(velknaziAZakonnici).s(jezis).isliDo(predVladnouBudovou);
        annasovVojak.s(jezis).isliDo(vladnaBudova);
        Muz pilat = new Muz("Pilat", "Pilátovi");
        pilat.bol(vladnaBudova).isielDo(predVladnouBudovou).povedal("Akú žalobu podávate proti tomuto človeku?",
                velknaziAZakonnici);
        velknaziAZakonnici.povedali("Keby tento nebol zločinec, neboli by sme ti ho vydali.");
        pilat.povedal("Vezmite si ho vy a súďte podľa svojho zákona!", velknaziAZakonnici);
        velknaziAZakonnici.povedali("My nesmieme nikoho usmrtiť."); // Veď inokedy kameňovali, teraz nesmú?
        pilat.isielDo(vladnaBudova).povedal("Si židovský kráľ?", jezis);
        jezis.povedal("Hovoríš to sám od seba, alebo ti to iní povedali o mne?", pilat);
        pilat.povedal("Vari som ja Žid? Tvoj národ a veľkňazi mi ťa vydali. Čo si vykonal?", jezis);
        jezis.povedal("Moje kráľovstvo nie je z tohto sveta. Keby moje kráľovstvo bolo z tohto sveta, " +
                "moji služobníci by sa bili, aby som nebol vydaný Židom. Lenže moje kráľovstvo nie je stadiaľto.",
                pilat);
        pilat.povedal("Tak predsa si kráľ?", jezis);
        jezis.povedal("Sám hovoríš, že som kráľ. Ja som sa na to narodil a na to som prišiel na svet, " +
                "aby som vydal svedectvo pravde. Každý, kto je z pravdy, počúva môj hlas.", pilat);
        pilat.povedal("Čo je pravda?"); // Filozof je to!
        pilat.isielDo(predVladnouBudovou).povedal("Ja na ňom nenachádzam nijakú vinu. Je však u vás" +
                " zvykom, že vám na Veľkú noc prepúšťam jedného väzňa. Chcete teda, aby som vám " +
                "prepustil židovského kráľa?", velknaziAZakonnici);
        velknaziAZakonnici.povedali("Toho nie, ale Barabáša!");


        // 19 kapitola
        Muz pilatovVojak = new Muz("Pilatov vojak", "Pilátovmu vojakovi");
        pilatovVojak.s(jezis).isliDo(new ZaujimaveMiesto("Bicovaci kol"));
        Bic bic = new Bic();
        pilatovVojak.malSoSebou(bic)
                .udrelKohoKamCim(jezis, CastTela.TRUP, bic)
                .udrelKohoKamCim(jezis, CastTela.TVAR, bic)
                .udrelKohoKamCim(jezis, CastTela.NOHA, bic);
        // ...

        Predmet trnovaKoruna = pilatovVojak.vyrobilPredmet("Trnova koruna");
        pilatovVojak
                .dal(trnovaKoruna, jezis)
                .dal(new Predmet("Purpurovy plast"), jezis);
        Ludia ostatniPilatoviVojaci = new Ludia("Ostatni Pilatovi vojaci", "ostatným Pilátovym vojakom");
        pilatovVojak.s(ostatniPilatoviVojaci).povedali("Buď pozdravený, židovský kráľ!");
        pilat.isielDo(predVladnouBudovou).povedal("Pozrite, privádzam vám ho von, aby ste vedeli, že na ňom nijakú vinu nenachádzam.");
        pilatovVojak.s(jezis).isliDo(predVladnouBudovou);
        pilat.povedal("Hľa, človek!");
        velknaziAZakonnici.povedali("Ukrižuj! Ukrižuj ho!");
        pilat.povedal("Vezmite si ho a ukrižujte. Ja na ňom nenachádzam vinu.");
        velknaziAZakonnici.povedali("My máme zákon a podľa zákona musí umrieť, lebo sa vydával za Božieho Syna.");
        pilat.saZlakol().isielDo(vladnaBudova).povedal("Odkiaľ si?", jezis);
        jezis.povedal("", pilat); // Adresné mlčanie
        pilat.povedal("So mnou sa nechceš rozprávať?! Nevieš, že mám moc prepustiť ťa a moc ukrižovať ťa?", jezis);
        jezis.povedal("Nemal by si nado mnou nijakú moc, keby ti to nebolo dané zhora. Preto má väčší hriech ten, čo ma vydal tebe.", pilat);
        pilat.dostal(Pocit.LUTOST);
        velknaziAZakonnici.povedali("Ak ho prepustíš, nie si priateľom cisára. Každý, kto sa vydáva za kráľa, stavia sa proti cisárovi.");

        Miesto gabatta = new ZaujimaveMiesto("Litosthrotus - Gabatta");
        pilat.s(pilatovVojak).s(ostatniPilatoviVojaci).s(jezis).s(velknaziAZakonnici).isliDo(gabatta);
        Tron sudnaStolica = new Tron("Sudna stolica", gabatta);
        pilat.siSadol(sudnaStolica);
        // TODO bolo okolo poludnia
        pilat.povedal("Hľa, váš kráľ!", velknaziAZakonnici);
        velknaziAZakonnici.povedali("Preč s ním! Preč s ním! Ukrižuj ho!");
        pilat.povedal("Vášho kráľa mám ukrižovať?!", velknaziAZakonnici);
        velknaziAZakonnici.povedali("Nemáme kráľa, iba cisára!");
        Predmet kriz = new Predmet("Priečne brvno kríža");
        jezis.zodvihol(kriz);
        ZaujimaveMiesto golgota = new ZaujimaveMiesto("Golgota");
        jezis.isielDo(golgota);
        jan.s(velknaziAZakonnici).s(pilatovVojak).s(ostatniPilatoviVojaci).isliDo(golgota);
        pilatovVojak.pribil(jezis, kriz);
        Predmet zvisleRamenoKriza = new Predmet("Zvisle rameno kriza");
        pilatovVojak.pribil(jezis, zvisleRamenoKriza);
        // TODO dalsi dvaja ukrizovani
        Predmet napisNaKriz = pilat.vyrobilPredmet("Napis na kriz s textom: \"Ježiš Nazaretský, židovský kráľ.\"");
        pilatovVojak.pribil(napisNaKriz, zvisleRamenoKriza);
    }
}
