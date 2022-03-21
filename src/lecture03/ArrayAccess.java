package lecture03;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/19
 * Github : http://github.com/bee0113
 */
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[5];

        int max = 0;

        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        System.out.println("가장 큰 수는" + max + "입니다.");
        scanner.close();
    }
}
