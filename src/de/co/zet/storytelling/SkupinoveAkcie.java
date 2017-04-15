package de.co.zet.storytelling;

import java.util.stream.Stream;

/**
 * TODO Description HERE.
 */
public interface SkupinoveAkcie {
    Stream<Clovek> publishedStream();

    default SkupinoveAkcie hovoria(String slova) {
        StringBuilder sb = new StringBuilder();
        this.publishedStream().forEach((bytost) -> sb.append(bytost.meno() + ": "));
        sb.append(slova.toUpperCase());
        System.out.println(sb.toString());
        return this;
    }

    default SkupinoveAkcie povedali(String slova) {
        hovoria(slova);
        return this;
    }

    default SkupinoveAkcie hovoriaAnonymne(String slova) {
        System.out.println((slova.toUpperCase()));
        return this;
    }
}
