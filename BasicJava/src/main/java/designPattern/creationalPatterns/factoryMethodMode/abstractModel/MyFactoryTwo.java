package designPattern.creationalPatterns.factoryMethodMode.abstractModel;

import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassOne;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassTwo;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyInterface;

public class MyFactoryTwo implements Provider {

    @Override
    public MyInterface produce() {
        return new MyClassTwo();
    }

}