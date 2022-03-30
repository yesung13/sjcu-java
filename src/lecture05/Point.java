package lecture05;

/**
 * Created by berno579@gmail.com on 2022/03/31
 * Github : http://github.com/bee0113
 */
public class Point {

    private int x, y; // 한 점을 구성하는 x, y 좌표

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
