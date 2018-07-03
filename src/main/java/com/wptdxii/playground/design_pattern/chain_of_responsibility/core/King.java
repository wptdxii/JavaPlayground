package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public final class King {
    private Handler chain;

    public King() {
        chain = buildChain();
    }

    private Handler buildChain() {
        Handler typeChecker = new TypeChecker();
        Handler descriptionChecker = new DescriptionChecker();
        Handler commander = new Commander();
        Handler officer = new Officer();
        Handler soldier = new Soldier();

        typeChecker.setSuccessor(descriptionChecker);
        descriptionChecker.setSuccessor(commander);
        commander.setSuccessor(officer);
        officer.setSuccessor(soldier);

        return typeChecker;
    }

    public void makeRequest(Request request) {
        if (!chain.handleRequest(request)) {
            if (request.isChecked() && !request.isHandled()) {
                System.out.println("Nobody handle the request");
            }
        }
    }
}
