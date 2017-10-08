package tinySpring02.ioc.factory;

import tinySpring02.ioc.BeanDefinition;

public interface BeanFactory {
    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
