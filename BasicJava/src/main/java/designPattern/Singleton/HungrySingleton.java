package designPattern.Singleton;

/**饿汉式--上来就创建
 * Created by hdfs on 2017/10/13.
 */
public class HungrySingleton {
  private static HungrySingleton mySingleton = new HungrySingleton();

  private HungrySingleton(){
    //私有化构造函数
    System.out.println("-->饿汉式单例模式开始调用构造函数");
  }

  //开放一个公有方法，判断是否已经存在实例，有返回，没有新建一个在返回
  public static HungrySingleton getInstance(){
    System.out.println("-->饿汉式单例模式开始调用公有方法返回实例");
    return mySingleton;
  }
}
