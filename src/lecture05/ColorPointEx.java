package lecture05;

/**
 * Created by berno579@gmail.com on 2022/03/31
 * Github : http://github.com/bee0113
 */
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2);            //Point
        p.showPoint();
        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
