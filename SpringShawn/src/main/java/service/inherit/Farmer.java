package service.inherit;

import org.springframework.stereotype.Component;

/**
 * Created by hdfs on 2017/9/29.
 */
@Component
public class Farmer extends Person {
  public String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
