package com.wptdxii.playground.design_pattern.chain_of_responsibility;


import com.wptdxii.playground.design_pattern.chain_of_responsibility.core.King;
import com.wptdxii.playground.design_pattern.chain_of_responsibility.core.Request;
import com.wptdxii.playground.design_pattern.chain_of_responsibility.core.RequestType;

public class Client {
    public static void main(String[] args) {
        King king = new King();
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.DEFAULT, "nothing"));
        king.makeRequest(new Request(RequestType.DEFAULT,""));
    }
}
