package enumShawn;

/**
 * Created by hdfs on 2017/9/30.
 */
public enum Color {
  RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);


  private String name ;
  private int index ;

  private Color( String name , int index ){
    this.name = name ;
    this.index = index ;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getIndex() {
    return index;
  }
  public void setIndex(int index) {
    this.index = index;
  }

public static void main(String args[]) {
  System.out.println(Color.RED.getName());
  Color.RED.setName("heihie");
  System.out.println(Color.RED.getName());
  System.out.println("---------------");
}
}