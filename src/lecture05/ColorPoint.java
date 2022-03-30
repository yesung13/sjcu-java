package lecture05;

/**
 * Created by berno579@gmail.com on 2022/03/31
 * Github : http://github.com/bee0113
 */
public class ColorPoint extends Point{
    private String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표
        System.out.print(color);
        showPoint();
    }
}
