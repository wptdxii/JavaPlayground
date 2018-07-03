package com.wptdxii.playground.design_pattern.mediator;

import com.wptdxii.playground.design_pattern.mediator.core.*;

public class Client {
    public static void main(String[] args) {
        Party party = new PartyImpl();

        PartyMember hobbit = new Hobbit();
        PartyMember wizard = new Wizard();
        PartyMember rogue = new Rogue();
        PartyMember hunter = new Hunter();

        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        hobbit.act(Action.ENEMY);
        wizard.act(Action.GOLD);
        rogue.act(Action.TALE);
        hobbit.act(Action.HUNT);
    }
}
