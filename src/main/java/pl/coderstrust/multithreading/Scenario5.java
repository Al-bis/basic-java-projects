package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Scenario5 {

  public static void executeScenario() {
    BlockingDeque<String> container = new LinkedBlockingDeque<>(10);
    ExecutorService threadPool = Executors.newFixedThreadPool(4);

    Consumer consumer1 = new Consumer(container, 10, "Consumer 10");
    Producer producer1 = new Producer(container, 1, "Producer 1");
    Producer producer2 = new Producer(container, 2, "Producer 2");
    Producer producer3 = new Producer(container, 3, "Producer 3");
    threadPool.submit(consumer1);
    threadPool.submit(producer1);
    threadPool.submit(producer2);
    threadPool.submit(producer3);

    threadPool.shutdown();
  }

}
