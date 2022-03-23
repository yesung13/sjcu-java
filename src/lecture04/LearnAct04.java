package lecture04;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct04 {

    public static void main(String[] args) {
        // double 타입의 일차원 배열을 매개변수로 전달받아 배열의 합을 리턴하는 getSum() 메서드 작성
        double num[] = {1.5, 2.2, 3.2, 4.7, 5.5}; //17.1
        getSum(num);
    }

    static double getSum(double param[]) {
        double sum = 0;
        for (int i = 0; i < param.length; i++) {
            sum += param[i];
        }
        System.out.println("배열의 합: " + sum);
        return sum;
    }

}
