package ChaosThread;

/**
 * 中断线程
 * */
public class Interrupt {
  public static void main(String[] args) throws InterruptedException {
    MyThread thread = new MyThread();

    thread.start();
    Thread.sleep(2);
    thread.interrupt();
    thread.join();

    System.out.println("end");
  }

}

class MyThread extends Thread {
  public void run() {
    int n = 0;

    while (!isInterrupted()) {
      n++;
      System.out.println(n);
    }
  }
}
