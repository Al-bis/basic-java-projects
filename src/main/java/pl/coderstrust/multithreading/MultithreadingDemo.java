package pl.coderstrust.multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

import static java.util.concurrent.TimeUnit.SECONDS;

public class MultithreadingDemo {

    public static void main(String[] args) throws InterruptedException {

        BlockingDeque<String> container = new LinkedBlockingDeque<>(10);

        Thread consumer = new Thread(() -> {
            System.out.println("Consumer start: ");
            while (true) {
                try {
                    String element = container.poll(2, SECONDS);
                    System.out.println("Consumer: " + element);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread producer = new Thread(() -> {
            System.out.println("Producer start: ");
            int count = 0;
            while (true) {
                try {
                    SECONDS.sleep(1);
                    container.offer("Value for container " + count);
                    System.out.println("Producer: produce " + count);
                    count++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
