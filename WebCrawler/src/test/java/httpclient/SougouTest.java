package httpclient;

import com.alibaba.fastjson.JSONObject;

public class SougouTest {
    public static void main(String[] args) {
        String url = "http://news.sogou.com/news?query=%B8%B4%D0%C7&mode=1&w=01029901&sut=2005&sst0=1510186928592&lkt=1%2C1510186928410%2C1510186928410";
        JSONObject result = HttpRequestUtils.httpGet(url);
        System.out.println(result);

    }
}
