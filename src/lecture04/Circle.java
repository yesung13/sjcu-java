package lecture04;

public class Circle {

    public int radius;  // 필드. 접근권한과 함께 변수 선언
    public String name;

    public Circle() {
        this.radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
