package lecture03;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class WhileSample {

    public static void main(String[] args) {
        int count = 0, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        int n = scanner.nextInt(); // 정수 입력
        while (n != -1) { // -1 경우 while문 종료
            sum += n;
            count++;
            n = scanner.nextInt(); // 정수 입력
        }

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.print("정수의 개수는 " + count + "개이며 ");
            System.out.println("평균은 " + (double) sum / count + "입니다");
        }

        scanner.close();


    }
}
