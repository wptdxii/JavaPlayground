package com.wptdxii.playground.design_pattern.chain_of_responsibility.core;

public final class Request {
    private boolean handled;
    private boolean checked;
    private RequestType requestType;
    private String requestDescription;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public void markHandled() {
        handled = true;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isHandled() {
        return handled;
    }

    public boolean isChecked() {
        return checked;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }
}
