package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct01 {


    public static void main(String[] args) {
        // 1. for문, while문, do while문을 이용하여 구구셈을 출력
        System.out.println("구구단");
        gugudan();

        // 2. 소문자 a부터 z 뿐만 아니라 대문자 A부터 Z까지 차례대로 출력하는 프로그램을 작성
        System.out.println("대소문자");
        lowerUpperCase();
    }

    public static void lowerUpperCase() {
        char lowC = 'a';
        char upC = 'A';

        do {
            System.out.print(lowC);
            lowC = (char) (lowC + 1);
        } while (lowC <= 'z');
        System.out.println();

        do {
            System.out.print(upC);
            upC = (char) (upC + 1);
        } while (upC <= 'Z');
        System.out.println();

    }

    public static void gugudan() {
        int i = 1;
        do {

            while (i < 10) {
                System.out.print("[" + i + "단]\t");
                for (int j = 1; j < 10; j++) {
                    System.out.print(i + "*" + j + "=" + (i * j));
                    System.out.print("\t");
                }
                System.out.println();
                i++;
            }

        } while (i < 10);
    }

}
