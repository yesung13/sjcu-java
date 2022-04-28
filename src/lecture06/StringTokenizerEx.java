package lecture06;

import java.util.StringTokenizer;

/**
 * Created by berno579@gmail.com on 2022/04/09
 * Github : http://github.com/bee0113
 */
public class StringTokenizerEx {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        while(st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }

    }
}
