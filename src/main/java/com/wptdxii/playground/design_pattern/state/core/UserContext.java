package com.wptdxii.playground.design_pattern.state.core;

public class UserContext {
    private UserState state;
    private User user;

    public UserContext() {
        this.state = new LogoutState();
    }


    public void setState(UserState state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void comment() {
        this.state.comment(this);
    }

    public void login() {
        System.out.println("Login...");

        setState(new LoginState());
    }

    public void logout() {
        System.out.println("Logout...");

        setState(new LogoutState());
    }
}
