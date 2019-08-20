package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Scenario6 {

  public static void main(String[] args) {
    BlockingDeque<String> container = new LinkedBlockingDeque<>(10);
    ExecutorService threadPool = Executors.newFixedThreadPool(4);

    Consumer consumer1 = new Consumer(container, 2, "Consumer 2");
    Consumer consumer2 = new Consumer(container, 6, "Consumer 6");
    Producer producer1 = new Producer(container, 1, "Producer 1");
    Producer producer2 = new Producer(container, 5, "Producer 5");
    threadPool.submit(consumer1);
    threadPool.submit(consumer2);
    threadPool.submit(producer1);
    threadPool.submit(producer2);

    threadPool.shutdown();
  }

}
