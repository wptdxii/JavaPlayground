package com.wptdxii.playground.design_pattern.factory_method.core;

/**
 * simple factory
 */
public final class WarcraftFactory {
    private WarcraftFactory() {
        throw new UnsupportedOperationException("Can't be instantiated");
    }

    public static Warcraft createWarcraft(WarcraftType type) {
        switch (type) {
            case THIEF:
                return new Thief();
            case WARRIOR:
                return new Warrior();
            default:
                throw new IllegalArgumentException("WarcraftType not supported.");
        }
    }
}
