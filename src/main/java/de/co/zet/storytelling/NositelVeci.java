package de.co.zet.storytelling;

public interface NositelVeci {
    default NositelVeci malSoSebou(Vec vec) {
        return this;
    }

    default NositelVeci vytiahol(Vec vec) {
        return this;
    }

    default NositelVeci pouzil(Vec vec) {
        return this;
    }

    default NositelVeci pouzil(Vec vec, Object naCo) {
        return this;
    }

    default NositelVeci hodil(Vec vec) {
        return this;
    }

    default NositelVeci hodil(Vec vec, Miesto kam) {
        return this;
    }

    default NositelVeci zodvihol(Vec vec) {
        return this;
    }

    default NositelVeci namocili(Predmet co, Predmet kam) {
        return this;
    }

    default NositelVeci dali(Predmet co, Clovek komu) {
        return this;
    }
}
