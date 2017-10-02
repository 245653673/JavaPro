package service.inherit;

import org.springframework.stereotype.Component;

/**
 * Created by hdfs on 2017/9/29.
 */
@Component
public class Student extends Person {
  public Integer age;

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
