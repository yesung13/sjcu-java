package lecture04;

import java.lang.reflect.Array;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct01 {

    public static void main(String[] args) {
        // 2.
        System.out.println("2문제");
        example2();
    }

    public static void example2() {
        Human[] h = new Human[5];

        h[0] = new Human("홍길동", 20, 177.0, 67.5);
        h[1] = new Human("김세종", 25, 172.1, 62.6);
        h[2] = new Human("이민우", 30, 167.2, 57.7);
        h[3] = new Human("신은지", 35, 162.3, 52.8);
        h[4] = new Human("현정민", 40, 157.4, 48.9);


    }

}
