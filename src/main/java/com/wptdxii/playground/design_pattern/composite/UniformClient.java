package com.wptdxii.playground.design_pattern.composite;

import com.wptdxii.playground.design_pattern.composite.uniform.Messenger;

public class UniformClient {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.messageForOrcs().print();
        messenger.messageFromElves().print();
    }
}
