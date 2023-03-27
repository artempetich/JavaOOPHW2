package org.example.task1;
public class Main {
    public static void main(String[] args) {
        Human hm = new Human("Саша", false, false);
        Buyer bhm = new Human("Паша", false, false);
        Market market = new Market();
        market.acceptToMarket(hm);
        market.takeLnQueue(hm);
        market.takeOrders();
        market.takeLnQueue(bhm);
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
    }
}