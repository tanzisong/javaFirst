import Second.Second;

import java.beans.IntrospectionException;

public class First {
  public static void main(String[] args) throws IntrospectionException, NoSuchMethodException, NoSuchFieldException {
//    数组
//    int[] arr = new int[] { 1, 2, 3, 4, 5 };
//    String[] strArr = {"1", "2", "2", "2", "2"};
//    int sign = 4;
//    System.out.println(arr[sign]);
//    System.out.println(strArr[sign]);

//    输入与输出
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入你的姓名:");
//    String name = scanner.nextLine();
//
//    System.out.println("请输入你的年龄:");
//    int age = scanner.nextInt();
//
//    System.out.printf("Hi! %s, you are %d;\n", name, age);

//    遍历数组
//    int[] arr = new int[]{4,5,36,47,58};
//    for (int i = 0; i < arr.length; i++) {
//      System.out.printf("%d, %d\n", i, arr[i]);
//    }
//
//    System.out.println("for each");
//
//    for (int a: arr) {
//      System.out.println(a);
//    }

    // 数组排序
//    Integer[] arr = new Integer[]{2,3,4,5,6,7,8,1};

//    Arrays.sort(arr, Collections.reverseOrder());
//    System.out.println(Arrays.toString(arr));

//    Person person = new Person();
//    person.sayName("1", "2", "3");

//    Human human_1 = new Human();
//    human_1.Go();
//    System.out.println(human_1.Go("???"));

    Second second = new Second();
    second.run();
  }
}

class Person {
  private String[] names;

  {
    sayName("5");
  }

  public void sayName(String... names) {
    for (String s : names) {
      System.out.println(s);
    }

    this.names = names;
  }
}

/**
 * 方法重载
 */
class Human {
  public void Go() {
    System.out.println("无返参Go");
  }

  public String Go(String name) {
    return "Go";
  }
}

/**
 * parent and son class
 */
class Parent {
  public Parent() {
  }
}

class Son extends Parent {
  public Son() {
  }
}

interface Tan {
  void run();
}

class Outer {
  private String name;

  Outer(String name) {
    this.name = name;
  }

  public void methods() {
    String T = "TanZiSong";
    String t = "tanZiSong";

    System.out.println(T.equalsIgnoreCase(t));


    Tan r = new Tan() {
      public void run() {
        System.out.println("Hello, " + Outer.this.name);
      }
    };

  }
}

