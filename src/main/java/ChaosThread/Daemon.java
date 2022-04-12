package ChaosThread;

import java.time.LocalTime;

/** 守护线程 */
public class Daemon {
  public static void main(String[] args) throws InterruptedException {
    MyTestThread testThread = new MyTestThread();

//    testThread.setDaemon(true);
    testThread.start();
//    testThread.join(); // 主线程处于pending状态, 暂停执行主线程代码

    System.out.println("end");
  }
}

class MyTestThread extends Thread {
  @Override
  public void run() {
    int n = 0;
    while (n<2) {
      n++;
      System.out.println(LocalTime.now());

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        break;
      }
    }
  }
}