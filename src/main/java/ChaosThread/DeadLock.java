package ChaosThread;

/** 制造死锁 */
public class DeadLock {
  public static void main(String[] args) {
    DeadLockAdd add = new DeadLockAdd();
    DeadLockDec dec = new DeadLockDec();

    new Thread(new Runnable() {
      @Override
      public void run() {
        add.run();
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        dec.run();
      }
    }).start();
  }
}

class LockClass {
  static final Object LockA = new Object();
  static final Object LockB = new Object();
}

class DeadLockAdd {
  public void run() {
    synchronized (LockClass.LockA) {
      System.out.println("add 获取LockA");

      synchronized (LockClass.LockB) {
        System.out.println("add 获取LockB");
      }
    }
  }
}

class DeadLockDec {
  public void run() {
    synchronized (LockClass.LockB) {
      System.out.println("dec 获取LockB");

      synchronized (LockClass.LockA) {
        System.out.println("dec 获取LockA");
      }
    }
  }
}
