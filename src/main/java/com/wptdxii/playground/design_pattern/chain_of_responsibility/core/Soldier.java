package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public final class Soldier extends RequestHandler {

    @Override
    public boolean propagateRequest(Request request) {
        if (RequestType.COLLECT_TAX.equals(request.getRequestType())) {
            printRequest(request);
            request.markHandled();
            return true;
        }
        return false;
    }
}
