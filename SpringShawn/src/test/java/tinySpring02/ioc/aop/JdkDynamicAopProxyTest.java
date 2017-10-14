package tinySpring02.ioc.aop;

import org.junit.Test;
import tinySpring02.ioc.HelloWorldService;
import tinySpring02.ioc.HelloWorldServiceAOP;
import tinySpring02.ioc.context.ApplicationContext;
import tinySpring02.ioc.context.ClassPathXmlApplicationContext;

public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() throws Exception {
        // --------- helloWorldService without AOP
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldServiceAOP helloWorldService = (HelloWorldServiceAOP) applicationContext.getBean("helloWorldServiceAOP");
        helloWorldService.helloWorld();

        // --------- helloWorldService with AOP
        // 1. 设置被代理对象(Joinpoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldServiceAOP.class);
        advisedSupport.setTargetSource(targetSource);

        // 2. 设置拦截器(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 3. 创建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWorldServiceAOP helloWorldServiceProxy = (HelloWorldServiceAOP) jdkDynamicAopProxy.getProxy();

        // 4. 基于AOP的调用
        helloWorldServiceProxy.helloWorld();

    }
}
