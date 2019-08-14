package pl.coderstrust.multithreading;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable {

  private BlockingDeque<String> container;
  private long time;
  private String id;
  private static int count = 0;

  public Producer(BlockingDeque<String> container, long time, String id) {
    this.container = container;
    this.time = time;
    this.id = id;
  }

  public BlockingDeque<String> getContainer() {
    return container;
  }

  public long getTime() {
    return time;
  }

  public String getId() {
    return id;
  }

  @Override
  public void run() {
    System.out.println(id + " start: ");
    while (true) {
      try {
        SECONDS.sleep(time);
        container.offer("Value " + count, 100, SECONDS);
        System.out.println(id + " produce : " + count);
        synchronized (this) {
          count++;
        }
        if (count > 100) {
          break;
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
