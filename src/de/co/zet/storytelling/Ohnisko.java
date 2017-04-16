package de.co.zet.storytelling;

public class Ohnisko extends ZaujimaveMiesto implements ZdrojTepla, Miesto {
    public Ohnisko(String oznacenie) {
        super(oznacenie);
    }

    public Ohnisko(String oznacenie, Miesto umiestnenie) {
        super(oznacenie, umiestnenie);
    }
}
