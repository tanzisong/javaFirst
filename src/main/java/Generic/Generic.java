package Generic;

import java.io.IOException;
import java.util.*;

public class Generic {
  public static void main(String[] args) throws IOException {
//    MapTest map = new MapTest();
    Properties props = new Properties();
  }

  public void ListClass() {
//    List<Integer> lists = List.of();
    List<Integer> list = new ArrayList<Integer>(10);
    list.add(1);
    list.add(2);

    Integer[] array = list.toArray(new Integer[0]);

    List a = Arrays.asList(array);
  }
}
