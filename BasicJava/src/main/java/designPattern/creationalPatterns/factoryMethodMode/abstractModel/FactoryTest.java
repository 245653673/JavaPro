package designPattern.creationalPatterns.factoryMethodMode.abstractModel;

import designPattern.creationalPatterns.factoryMethodMode.normalMode.MyInterface;

/**
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则。

 为解决这个问题，我们来看看抽象工厂模式：创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。

 这样就符合闭包原则了。
 */
public class FactoryTest {

    public static void main(String[] args){
        Provider provider = new MyFactoryOne();
        MyInterface myi = provider.produce();
        myi.print();
    }

}