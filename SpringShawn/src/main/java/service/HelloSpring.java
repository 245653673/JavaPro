package service;

import org.springframework.stereotype.Component;

/**
 * Created by hdfs on 2017/9/28.
 */
@Component("helloSpring")
public class HelloSpring {
  private String name;

  public void sayHello(){
    System.out.println(name+": say Hello to you");
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void init(){
    System.out.println("hi!!");
  }

  public void destory(){
    System.out.println("bye!!!");
  }
}
