package com.wptdxii.playground.design_pattern.state;

import com.wptdxii.playground.design_pattern.state.core.User;
import com.wptdxii.playground.design_pattern.state.core.UserContext;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Someone");

        UserContext context = new UserContext();
        context.setUser(user);
        context.comment();

        context.login();
        context.comment();

        context.logout();
        context.comment();
    }
}
