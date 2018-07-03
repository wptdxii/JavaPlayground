package com.wptdxii.playground.design_pattern.mediator.core;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party {
    private List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }
}
