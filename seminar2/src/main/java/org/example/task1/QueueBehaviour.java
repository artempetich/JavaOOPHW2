package org.example.task1;
public interface QueueBehaviour {
    void takeLnQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}