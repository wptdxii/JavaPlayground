package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public final class TypeChecker extends CheckerHandler {

    @Override
    public boolean propagateRequest(Request request) {
        if (request.getRequestType() != null) {
            printRequest(request);
            return true;
        }
        System.out.println("Please check the request type");
        return false;
    }
}
