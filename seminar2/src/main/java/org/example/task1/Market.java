package org.example.task1;
import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Buyer> actors = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " зашел в магазин");
    }
    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " вышел из магазина");
    }
    @Override
    public void takeLnQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        assert actorsQueue.peek() != null;
        System.out.println(actorsQueue.peek().getName() + " зашел в магазин");
        assert actorsQueue.peek() != null;
        actorsQueue.peek().isTakeOrder();

    }
    @Override
    public void giveOrders() {
        assert actorsQueue.peek() != null;
        actorsQueue.peek().isMakeOrder();
        assert actorsQueue.peek() != null;
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }
    @Override
    public void releaseFromQueue() {
        assert actorsQueue.peek() != null;
        System.out.println(actorsQueue.peek().getName() + " вышел из очереди");
        actorsQueue.poll();
    }
}