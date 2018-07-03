package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public interface Handler {

    void setSuccessor(Handler successor);

    boolean propagateRequest(Request request);

    boolean handleRequest(Request request);

    void printRequest(Request request);
}
