package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public final class DescriptionChecker extends CheckerHandler {

    @Override
    public boolean propagateRequest(Request request) {
        String description = request.getRequestDescription();
        if (description != null && !description.trim().isEmpty()) {
            printRequest(request);
            return true;
        }
        System.out.println("Pleas check the request description");
        return false;
    }
}
