package tinySpring02.ioc;

public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}

