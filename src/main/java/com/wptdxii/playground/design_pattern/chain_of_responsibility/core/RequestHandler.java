package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public abstract class RequestHandler implements Handler {
    private Handler successor;

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public abstract boolean propagateRequest(Request request);

    @Override
    public final boolean handleRequest(Request request) {
        return propagateRequest(request) || (successor != null && successor.handleRequest(request));
    }

    @Override
    public void printRequest(Request request) {
        System.out.println(this + " handle the request:" + request.getRequestDescription());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
