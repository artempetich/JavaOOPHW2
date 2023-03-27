package org.example.task1;
public class Human extends Buyer {

    public Human(String name, boolean mOrder, boolean tOrder) {
        super(name, mOrder, tOrder);
    }

    @Override
    public boolean isMakeOrder() {
        return mOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return tOrder;
    }
    @Override
    public void setMakeOrder() {
        mOrder = true;
    }
    @Override
    public void setTakeOrder() {
        tOrder = true;
    }
    @Override
    String getName() {
        return name;
    }
}
