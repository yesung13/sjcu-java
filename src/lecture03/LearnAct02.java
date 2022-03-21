package lecture03;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct02 {


    public static void main(String[] args) {
        // 1. continue문 -> break문을 사용한 결과를 예상
        System.out.println("1문제");
        continueExample();

        // 2. break문 -> continue문을 사용한 결과를 예상
       System.out.println("2문제");
//        breakExample();
    }

    public static void breakExample() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");

        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                continue;
            }
        }
//        System.out.println("종료합니다.....");

//        scanner.close();

    }

    public static void continueExample() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if (n <= 0) {
                break; // 양수가 아닌 경우 다음 반복으로 진행
            } else {
                sum += n; // 양수인 경우 덧셈
            }
        }
        System.out.println("양수의 합은 " + sum);
        scanner.close();
    }

}
