package io.NIOReadFile;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hdfs on 2017/9/30.
 */
public class MappedReadFile {

  public void readFileByMapped(Path filepath){
    try
    {
      FileChannel channel = FileChannel.open(filepath);
      int length = (int) channel.size();
      //通过通道的map方法映射内存
      MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, length);
      for (int p = 0; p < length; p++)
      {
        int c = buffer.get(p);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static void main(String args[]) {
    System.out.println(System.getProperty("user.dir"));
    String filePath = "BasicJava\\src\\main\\resources\\file1";
    new MappedReadFile().readFileByMapped(Paths.get(filePath));
  }
}
