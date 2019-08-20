package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Scenario4 {

  public static void main(String[] args) {
    BlockingDeque<String> container = new LinkedBlockingDeque<>(10);
    ExecutorService threadPool = Executors.newFixedThreadPool(4);

    Consumer consumer1 = new Consumer(container, 1, "Consumer 1");
    Consumer consumer2 = new Consumer(container, 2, "Consumer 2");
    Consumer consumer3 = new Consumer(container, 3, "Consumer 3");
    Producer producer1 = new Producer(container, 10, "Producer 10");
    threadPool.submit(consumer1);
    threadPool.submit(consumer2);
    threadPool.submit(consumer3);
    threadPool.submit(producer1);

    threadPool.shutdown();
  }

}
