package ChaosThread;

import java.util.Timer;
import java.util.TimerTask;

public class FirstThread {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("start");

    final Thread myThread = new CustomThread();
    myThread.start(); // 启动新线程

//    Thread.sleep(100); // 暂停100毫秒

    final Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        myThread.interrupt(); // 中断子线程
        timer.cancel();
      }
    }, 1);

//    myThread.join();
    System.out.println("end");
  }
}

class CustomThread extends Thread {
  @Override
  public void run() {
    int number = 0;
    System.out.println("线程two");
    while (!isInterrupted()) {
      number++;
      System.out.println("number is " + number);
    }
  }
}