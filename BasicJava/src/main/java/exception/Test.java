package exception;

/**
 * Created by hdfs on 2017/10/13.
 */
public class Test {
  public int test01(){
    int ret = 0;
    try{
      throw new Exception();
    }
    catch(Exception e){
      ret = 1;
      return ret;
    }
    finally{
      ret = 2;
    }
  }

  public static void main(String args[]) {
    System.out.println(new Test().test01());
  }
}
