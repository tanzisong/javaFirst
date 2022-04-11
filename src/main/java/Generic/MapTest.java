package Generic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
  MapTest() {
//    MapMethods();
//    DefaultOrderTreeMap();
//    CustomizedOrderTreeMap();
  }

  public void MapMethods() {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("tan", 3);
    map.put("zi", 2);
    map.put("song", 4);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println(key + "=" + value);
    }
  }

//  private void TreeMapMethods() {
//    Map<Compare, Integer> map = new TreeMap<Compare, Integer>();
//
//    map.put(Compare.key_1, 1);
//  }

  private void DefaultOrderTreeMap() {
    Map<String, Integer> map = new TreeMap<String, Integer>();

    map.put("tan", 1);
    map.put("zi", 2);
    map.put("song", 3);
    map.put("a", 4);

    for (Map.Entry<String, Integer> item : map.entrySet()) {
      System.out.println(item.getKey() + item.getValue());
    }
  }

  private void CustomizedOrderTreeMap() {
    Map<Student, Integer> map = new TreeMap<Student, Integer>(new Comparator<Student>() {
      public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
      }
    });

    map.put(new Student("tan"), 100);
    map.put(new Student("zi"), 99);
    map.put(new Student("song"), 98);

    for (Map.Entry<Student, Integer> item : map.entrySet()) {
      System.out.println(item.getKey());
      System.out.println(item.getValue());
      System.out.println("------------------");
    }
  }
}

class Student {
  public String name;

  Student(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}