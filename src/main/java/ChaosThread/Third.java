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

    System.out.println("end1");

    new Thread(new Runnable() {
      public void run() {
        testThread1.Run2();
      }
    }).start();

    System.out.println("end2");
  }
}

class TestThread {
  public synchronized void Run1() {
    try {
      Thread.sleep(1000);
      System.out.println("Run - 1");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized void Run2() {
    try {
      Thread.sleep(1000);
      System.out.println("Run - 2");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
