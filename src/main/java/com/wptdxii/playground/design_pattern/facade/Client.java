package com.wptdxii.playground.design_pattern.facade;

import com.wptdxii.playground.design_pattern.facade.core.DwarvenMineFacade;

public class Client {
    public static void main(String[] args) {
        DwarvenMineFacade facade = DwarvenMineFacade.getInstance();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
