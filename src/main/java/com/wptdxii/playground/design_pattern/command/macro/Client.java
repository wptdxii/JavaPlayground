package com.wptdxii.playground.design_pattern.command.macro;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.order(new MainCommand());
        waiter.order(new SideCommand());
        waiter.orderOver();
    }
}
