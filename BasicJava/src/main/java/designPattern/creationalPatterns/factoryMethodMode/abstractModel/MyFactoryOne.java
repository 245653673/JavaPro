package designPattern.creationalPatterns.factoryMethodMode.abstractModel;

import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassOne;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyInterface;

public class MyFactoryOne implements Provider {

    @Override
    public MyInterface produce() {
        return new MyClassOne();
    }

}