package com.wptdxii.playground.design_pattern.abstract_factory.core;

public interface KingdomFactory {
    Army createArmy();

    Castle createCastle();

    King createKing();
}
