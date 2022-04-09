package lecture05;

import java.util.Objects;

/**
 * Created by berno579@gmail.com on 2022/03/31
 * Github : http://github.com/bee0113
 */
public class Point {

    private int x, y; // 한 점을 구성하는 x, y 좌표

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
