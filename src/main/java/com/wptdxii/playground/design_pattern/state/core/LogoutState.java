package com.wptdxii.playground.design_pattern.state.core;

public class LogoutState implements UserState{

    @Override
    public void comment(UserContext context) {
        System.out.println("Unable to comment, please login first!");
    }
}
