package Generic;

import java.io.FileInputStream;
import java.io.IOException;

public class Properties {
  Properties() throws IOException {
    getProperties();
  }

  private void getProperties() throws IOException {
    String filePath = "setting.properties";

    java.util.Properties props = new java.util.Properties();
    props.load(new FileInputStream(filePath));

    String value = props.getProperty("number");

    System.out.println("value => " + value);
  }

  private void setProperties() {

  }
}
