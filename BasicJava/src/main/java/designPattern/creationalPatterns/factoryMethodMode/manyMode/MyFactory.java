package designPattern.creationalPatterns.factoryMethodMode.manyMode;

import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassOne;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyClassTwo;
import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyInterface;

public class MyFactory {

    public MyInterface produceOne() {
        return new MyClassOne();
    }

    public MyInterface produceTwo() {
        return new MyClassTwo();
    }

}
