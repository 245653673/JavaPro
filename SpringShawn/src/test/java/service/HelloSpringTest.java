package service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hdfs on 2017/9/28.
 */
public class HelloSpringTest {
  @Test
  public void beanCreateTest(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-init.xml");

    HelloSpring helloService = (HelloSpring) applicationContext.getBean("helloSpring");
    helloService.setName("cat");
    helloService.sayHello();
    helloService = (HelloSpring) applicationContext.getBean("helloSpring");
    helloService.sayHello();

    ((ClassPathXmlApplicationContext) applicationContext).close();
  }
}
