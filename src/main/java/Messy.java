public class Messy {
  public static void main(String[] args) {
    AAA aaa = new AAA();
    aaa.recursive();
  }

  Messy() {
//    String num = "123";
//    int strNum = Integer.parseInt(num);
//    String num_1 = String.valueOf(strNum);
//
//    String s2 = new String(new char[]{'1', '2' });
    String str = null;
    Integer num = Integer.valueOf("11");
    int n = num.intValue();
  }
}

class AAA {
  private int count = 1;

  public void recursive() {
    System.out.println("begin");

    this.count++;
    if (this.count < 3) {
      recursive();
    }

    System.out.println("over");
  }
}
