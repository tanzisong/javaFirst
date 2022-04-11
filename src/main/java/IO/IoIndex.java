package IO;

import java.io.File;
import java.io.IOException;

public class IoIndex {
  public static void main(String[] args) throws IOException {
    File f = new File("common");
    File[] fs1 = f.listFiles();

    for (File file : fs1) {
      if(file != null) {
        System.out.println(file);
      }
    }
  }
}
