package designPattern.Singleton;

/**
 * 懒汉模式的改进版，适应于多线程安全，不要因为代码和饿汉模式差不多而归于饿汉模式的改进版
 * Created by hdfs on 2017/10/13.
 *
 * 内部类被加载的时间在外部类调用构造函数后。也就是说，第一次装载外部类的时候，内部类没有被加载，
 * 一直到我们调用s1 = Singleton.singleton时，内部类才被加载（延迟加载），又因为他是静态的域
 * ，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证他的线程安全性。
 */
public class LasySingletonBoost {
  /**
   * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
   * 没有绑定的关系，而且只有被调用到才会装载，从而实现了延迟加载
   * @author qian.xu
   *
   */
  private static class Singleton{
    /**
     * 静态初始化器，用JVM来保证线程安全，
     */
    private static LasySingletonBoost singleton = new LasySingletonBoost();
    static {
      System.out.println("---->类级的内部类被加载");
    }
    private Singleton(){
      System.out.println("---->类级的内部类构造函数被调用");
    }
  }
  //私有化构造函数
  private LasySingletonBoost(){
    System.out.println("-->开始调用构造函数");
  }
  //开放一个公有方法，判断是否已经存在实例，有返回，没有新建一个在返回
  public static LasySingletonBoost getInstance(){
    System.out.println("-->开始调用公有方法返回实例");
    LasySingletonBoost s1 = null;
    s1 = Singleton.singleton;
    System.out.println("-->返回单例");
    return s1;
  }

  public static void main(String args[]) {
    System.out.println();
    LasySingletonBoost.getInstance();
    System.out.println();
  }
}
