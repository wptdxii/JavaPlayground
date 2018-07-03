package com.wptdxii.playground.design_pattern.memento.core;

public class Operation {
    private int result;

    public int getResult() {
        return result;
    }

    public void add(int num) {
        result += num;
    }

    public void subtract(int num) {
        result -= num;
    }

    public Memento createMemento() {
        MementoImpl mementoImpl = new MementoImpl();
        mementoImpl.setResult(result);
        return mementoImpl;
    }

    public void setMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.result = mementoImpl.getResult();
    }

    private static class MementoImpl implements Memento {
        private int result;

        int getResult() {
            return result;
        }

        void setResult(int result) {
            this.result = result;
        }
    }
}
