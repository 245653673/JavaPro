package security;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PolicyTest {

    public static void file() {
        File f = new File("H:\\Java\\JavaPro\\BasicJava\\src\\main\\java\\security\\r.txt");
        InputStream is;
        try {
            is = new FileInputStream(f);
            byte[] content = new byte[1024];
            while (is.read(content) != -1) {
                System.out.println(new String(content));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void network() {
        try {
            URL url = new URL("http://www.baidu.com");
            HttpURLConnection urlcon = (HttpURLConnection)url.openConnection();
            urlcon.connect();         //获取连接
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        System.out.println(System.getProperty("os.name"));
//        file();
        network();
    }
}