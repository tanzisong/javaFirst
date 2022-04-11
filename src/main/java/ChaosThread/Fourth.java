package ChaosThread;

public class Fourth {
  public static void main(String[] args) {
    final TestThread1 testThread = new TestThread1();

    new Thread(new Runnable() {
      public void run() {
        testThread.Run1();
      }
    }).start();

    new Thread(new Runnable() {
      public void run() {
        testThread.Run1();
      }
    }).start();
  }
}

class TestThread1 {
  public void Run1() {
    synchronized(this) {
      System.out.println("Run - 1");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void Run2() {
    synchronized(this) {
      System.out.println("Run - 2");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
