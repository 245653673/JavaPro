package tinySpring02.ioc.context;

import tinySpring02.ioc.BeanDefinition;
import tinySpring02.ioc.factory.AbstractBeanFactory;

public class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void refresh() throws Exception{
    }

    public Object getBean(String name) {
        return beanFactory.getBean(name);
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {

    }


}
