package Second;

import java.beans.IntrospectionException;
import java.lang.reflect.Field;

public class Second {
  public static void main(String[] args) {
  }

  public void run() throws IntrospectionException, NoSuchMethodException, NoSuchFieldException {
    Person person = new Person();

    Class p = person.getClass();
    System.out.println(p);
    System.out.println(p.getDeclaredMethod("run"));
    Field a = p.getField("name");
//    person.run();

    String s = String.valueOf(new Double(1.22));
    Class A = String.class;
    Class S = s.getClass();

    System.out.println(A);
    System.out.println(S);

//    BeanInfo Info = Introspector.getBeanInfo(Person.class);
//    for (PropertyDescriptor pd: Info.getPropertyDescriptors()) {
//      System.out.println(pd.getName());
//      System.out.println(pd.getReadMethod());
//      System.out.println(pd.getWriteMethod());
//      System.out.println("--------------------");
//    }

  }
}

class Person {
  private String name;
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void run() {
    System.out.println(Person.class.toString());
//    System.out.println(Num.two.value);

//    Log log = new Log();
//    Logger log = java.util.logging.Logger.getLogger("aaa");
//    log.debug("debug");
//    log.info("info");
//    log.warn("warn");
//    log.error("error");
  }
}

enum Num {
  one(0),
  two(1),
  three(2);

  public final int value;

  private Num(int value) {
    this.value = value;
  }
}