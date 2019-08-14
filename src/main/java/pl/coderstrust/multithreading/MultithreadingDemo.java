package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class MultithreadingDemo {

  public static void main(String[] args) {

    BlockingDeque<String> container = new LinkedBlockingDeque<>(10);
    ExecutorService threadPool = Executors.newFixedThreadPool(4);

    //scenario 1: one producer, one consumer with the same time interval
    Consumer consumer1 = new Consumer(container, 1, "Consumer 1");
    Producer producer1 = new Producer(container, 1, "Producer 1");
    threadPool.submit(consumer1);
    threadPool.submit(producer1);

    //scenario 2: one producer, one consumer, consumer is slower than producer
//    Consumer consumer1 = new Consumer(container, 4, "Consumer 4");
//    Producer producer1 = new Producer(container, 1, "Producer 1");
//    threadPool.submit(consumer1);
//    threadPool.submit(producer1);

    //scenario 3: one producer, one consumer, consumer is faster than producer
//    Consumer consumer1 = new Consumer(container, 1, "Consumer 1");
//    Producer producer1 = new Producer(container, 4, "Producer 4");
//    threadPool.submit(consumer1);
//    threadPool.submit(producer1);

    //scenario 4: one producer, some consumers, producer is much slower than consumers
//    Consumer consumer1 = new Consumer(container, 1, "Consumer 1");
//    Consumer consumer2 = new Consumer(container, 2, "Consumer 2");
//    Consumer consumer3 = new Consumer(container, 3, "Consumer 3");
//    Producer producer1 = new Producer(container, 10, "Producer 10");
//    threadPool.submit(consumer1);
//    threadPool.submit(consumer2);
//    threadPool.submit(consumer3);
//    threadPool.submit(producer1);

    //scenario 5: one consumer, some producers, consumer is much slower than producers
//    Consumer consumer1 = new Consumer(container, 10, "Consumer 10");
//    Producer producer1 = new Producer(container, 1, "Producer 1");
//    Producer producer2 = new Producer(container, 2, "Producer 2");
//    Producer producer3 = new Producer(container, 3, "Producer 3");
//    threadPool.submit(consumer1);
//    threadPool.submit(producer1);
//    threadPool.submit(producer2);
//    threadPool.submit(producer3);

    //scenario 6: some consumers, some producer
//    Consumer consumer1 = new Consumer(container, 2, "Consumer 2");
//    Consumer consumer2 = new Consumer(container, 6, "Consumer 6");
//    Producer producer1 = new Producer(container, 1, "Producer 1");
//    Producer producer2 = new Producer(container, 5, "Producer 5");
//    threadPool.submit(consumer1);
//    threadPool.submit(consumer2);
//    threadPool.submit(producer1);
//    threadPool.submit(producer2);

    threadPool.shutdown();
  }
}
