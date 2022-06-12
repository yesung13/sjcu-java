package lecture07;

import java.util.HashMap;

/**
 * Created by berno579@gmail.com on 2022/06/11
 * Github : http://github.com/bee0113
 */
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("baby", "아기");
        h.put(" love", "사랑");
        h.put("apple", "사과");
        String kor = h.get(" love");
        h.remove("apple");
        int n = h.size();
        System.out.println(n);

    }
}
