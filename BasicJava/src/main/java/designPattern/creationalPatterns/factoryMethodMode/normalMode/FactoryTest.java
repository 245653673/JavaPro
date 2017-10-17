package designPattern.creationalPatterns.factoryMethodMode.normalMode;

/**
 * 普通工厂模式就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class FactoryTest {

    public static void main(String[] args){
        MyFactory factory = new MyFactory();
        MyInterface myi = factory.produce("One");
        myi.print();
    }

}