package service.inherit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloSpring;

/**
 * Created by hdfs on 2017/9/29.
 */
public class PersonTest
{
  @Test
  public void beanCreateTest(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-init.xml");

    Student student = (Student) applicationContext.getBean("student");
    student.setName("cat");
    student.setAge(11);
    System.out.println(student.getName()+" age:"+student.getAge());

    Farmer farmer = (Farmer) applicationContext.getBean("farmer");
    farmer.setName("dog");
    farmer.setAddress("SH");
    System.out.println(farmer.getName()+" address:"+farmer.getAddress());
    System.out.println(student.getName()+" age:"+student.getAge());

//    helloService.sayHello();
//    helloService = (HelloSpring) applicationContext.getBean("helloSpring");
//    helloService.sayHello();

    ((ClassPathXmlApplicationContext) applicationContext).close();
  }
}

