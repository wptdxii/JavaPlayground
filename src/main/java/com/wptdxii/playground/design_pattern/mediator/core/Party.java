package com.wptdxii.playground.design_pattern.mediator.core;

public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);
}
