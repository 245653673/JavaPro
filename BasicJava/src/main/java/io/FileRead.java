package io;

import java.io.*;

/**这个类主要是验证字节流和字符流缓存的问题
 * 运行完成之后发现没啥关系呢？？？？
 * Created by hdfs on 2017/9/29.
 */
public class FileRead {

  public void readByStream(String filePath) throws Exception {
    File f = new File(filePath);
    InputStream in=new FileInputStream(f);
    byte[] b=new byte[(int) f.length()];
    for(int i=0;i<b.length;i++){
          b[i]=(byte) in.read();
      }
    in.close();
    System.out.println(new String(b));
  }

  public void readByReader(String filePath) throws Exception{
    File f = new File(filePath);
    Reader input=new FileReader(f);
    char[] c=new char[1024];
    int len=input.read(c);
    input.close();
    System.out.println(new String(c,0,len));
  }


  public static void main(String args[]) throws Exception {
    new FileRead().readByStream("D:\\softspace\\JavaProject\\BasicJava\\src\\main\\resources\\file1");
    new FileRead().readByReader("D:\\softspace\\JavaProject\\BasicJava\\src\\main\\resources\\file1");
  }
}
