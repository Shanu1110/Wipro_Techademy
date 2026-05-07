package Day9;

import java.util.concurrent.*;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ExecutorService deliveryAgents = Executors.newFixedThreadPool(3);

        Runnable orderTask = () -> {
            String orderName = Thread.currentThread().getName();
            System.out.println("Processing order by " + orderName);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("Order delivered by " + orderName);
        };

        for (int i = 1; i <= 10; i++) {
            deliveryAgents.submit(orderTask);
        }

        deliveryAgents.shutdown();
    }
}
