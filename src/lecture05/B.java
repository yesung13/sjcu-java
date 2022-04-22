package lecture05;

/**
 * Created by berno579@gmail.com on 2022/04/17
 * Github : http://github.com/bee0113
 */
public class B extends A {
    public B() {
        System.out.println("생성자 B");
    }

    public B(int x) {
        System.out.println("매개변수 생성자 B");
    }

    public String paramTest() {
        System.out.println("1");

        return "0";
    }
    public String paramTest(int x, int y) {
        System.out.println("3");

        return "0";
    }
}
