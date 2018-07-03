package com.wptdxii.playground.design_pattern.mediator.core;

public abstract class PartyMember {
    private Party party;

    public void joinParty(Party party) {
        this.party = party;
    }

    public void partyAction(Action action) {
        System.out.println(toString() + ":" + action.getDescription());
    }

    public void act(Action action) {
        if (party != null) {
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
