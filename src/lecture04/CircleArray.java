package lecture04;

public class CircleArray {

    public static void main(String[] args) {
        Circle[] c = new Circle[5];             // 객체 배열 선엄 및 생성

        for (int i = 0; i < c.length; i++) {   // 객체 배열 각 원소에 객체를 생성
            c[i] = new Circle(i);
        }

        for (int i = 0; i < c.length; i++) {    // 객체 배열의 각 원소에 접근
            System.out.print((int) (c[i].getArea()) + " ");

        }
    }
}
