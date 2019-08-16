package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Scenario2 {

  public static void executeScenario() {
    BlockingDeque<String> container = new LinkedBlockingDeque<>(10);
    ExecutorService threadPool = Executors.newFixedThreadPool(2);

    Consumer consumer1 = new Consumer(container, 4, "Consumer 4");
    Producer producer1 = new Producer(container, 1, "Producer 1");
    threadPool.submit(consumer1);
    threadPool.submit(producer1);

    threadPool.shutdown();
  }

}
