package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Scenario3 {

  public static void main(String[] args) {
    BlockingDeque<String> container = new LinkedBlockingDeque<>(10);
    ExecutorService threadPool = Executors.newFixedThreadPool(2);

    Consumer consumer1 = new Consumer(container, 1, "Consumer 1");
    Producer producer1 = new Producer(container, 4, "Producer 4");
    threadPool.submit(consumer1);
    threadPool.submit(producer1);

    threadPool.shutdown();
  }

}
