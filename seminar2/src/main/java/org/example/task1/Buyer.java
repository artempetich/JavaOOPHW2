package org.example.task1;
public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean mOrder;
    protected boolean tOrder;

    abstract String getName();

    public Buyer(String name, boolean mOrder, boolean tOrder) {
        this.name = name;
        this.mOrder = mOrder;
        this.tOrder = tOrder;
    }
}
