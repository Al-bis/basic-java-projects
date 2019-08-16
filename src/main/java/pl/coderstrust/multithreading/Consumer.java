package pl.coderstrust.multithreading;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable {

  private BlockingDeque<String> container;
  private long time;
  private String id;

  public Consumer(BlockingDeque<String> container, long time, String id) {
    this.container = container;
    this.time = time;
    this.id = id;
  }

  @Override
  public void run() {
    System.out.println(id + " start: ");
    while (true) {
      try {
        SECONDS.sleep(time);
        String element = container.poll(100, SECONDS);
        System.out.println(id + " : " + element);
      } catch (InterruptedException e) {
        e.printStackTrace();
        break;
      }
    }
  }

}
