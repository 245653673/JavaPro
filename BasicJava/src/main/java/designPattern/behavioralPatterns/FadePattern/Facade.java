package designPattern.behavioralPatterns.FadePattern;

public class Facade
{
    public void test()
    {
        ModuleA ma = new ModuleA();
        ma.testA();
        ModuleB mb = new ModuleB();
        mb.testB();
        ModuleC mc = new ModuleC();
        mc.testC();
    }

    public static void main(String[] args)
    {
        Facade facade = new Facade();
        facade.test();
    }
}