package designPattern.creationalPatterns.factoryMethodMode.staticModel;

import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassOne;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassTwo;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyInterface;

public class MyFactory {

    public static MyInterface produceOne() {
        return new MyClassOne();
    }

    public static MyInterface produceTwo() {
        return new MyClassTwo();
    }

}
