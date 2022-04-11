package ChaosThread;

public class Second {
  public static void main(String[] args) throws InterruptedException {
    AddThread addThread = new AddThread();
    DecThread decThread = new DecThread();

    addThread.start();
    decThread.start();

    decThread.join();
    addThread.join();
    System.out.println(Counter.count);
  }
}

class Counter {
  public static int count = 0;
  public static final Object lock = new Object();
}

class AddThread extends Thread {
  public void run() {
      synchronized (Counter.lock) {
        for (int i = 0; i < 3; i++) {
        Counter.count++;
        System.out.println("add: " + Counter.count);
      }
    }
  }
}

class DecThread extends Thread {
  public void run() {
      synchronized (Counter.lock) {
        for (int i = 0; i < 3; i++) {
        Counter.count--;
        System.out.println("dec: " + Counter.count);
      }

    }
  }
}
