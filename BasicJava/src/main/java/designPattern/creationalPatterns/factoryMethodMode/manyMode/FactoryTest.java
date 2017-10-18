package designPattern.creationalPatterns.factoryMethodMode.manyMode;

import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyInterface;

/**
 * 多个工厂方法模式，是对普通工厂方法模式的改进，多个工厂方法模式就是提供多个工厂方法，分别创建对象。
 */
public class FactoryTest {
    public static void main(String[] args){
        MyFactory factory = new MyFactory();
        MyInterface myi = factory.produceOne();
        myi.print();
    }
}
