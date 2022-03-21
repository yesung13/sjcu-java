package lecture03;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/19
 * Github : http://github.com/bee0113
 */
public class ArrayLength {
    public static void main(String[] args) {
        int intArray[] = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(intArray.length + "개의 정수를 입력하세요>>");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
        }

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        System.out.println("평균은 " + (double)sum/intArray.length + "입니다.");
        scanner.close();
    }
}
