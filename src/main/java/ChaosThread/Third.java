package ChaosThread;

public class Third {
  public static void main(String[] args) {
    final TestThread testThread1 = new TestThread();
    final TestThread testThread2 = new TestThread();

    new Thread(new Runnable() {
      public void run() {
        testThread1.Run1();
      }
    }).start();

    new Thread(new Runnable() {
      public void run() {
        testThread2.Run1();
      }
    }).start();
  }
}

class TestThread {
  public synchronized void Run1() {
    System.out.println("Run - 1");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized void Run2() {
    System.out.println("Run - 2");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
