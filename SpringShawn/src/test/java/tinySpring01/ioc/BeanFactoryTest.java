package tinySpring01.ioc;

import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test() {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();


    }
}
