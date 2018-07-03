package com.wptdxii.playground.design_pattern.composite;

import com.wptdxii.playground.design_pattern.composite.safe.Messenger;

public class SafeClient {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.messageForOrcs().print();
        messenger.messageFromElves().print();
    }
}
