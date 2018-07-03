package com.wptdxii.playground.design_pattern.state.core;

public class LoginState implements UserState {

    @Override
    public void comment(UserContext context) {
        System.out.println(context.getUser().getName() + " comment the message!");
    }
}
