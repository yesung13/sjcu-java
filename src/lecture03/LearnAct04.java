package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct04 {


    public static void main(String[] args) {
        // 1. 3행 5열의 총 15개의 숫자를 저장할 수 있는 정수형 2차원 배열을 선언하고, 1~15까지의 숫자로 초기화하시오
        System.out.println("1문제");
        example1();

        // 2. 각 행마다 행의 개수만큼 열을 가지는 정수형 비정방형 행렬 선언
        System.out.println("\n2문제");
        example2();
    }

    public static void example1() {
        int intArray[][] = new int[3][5];

        int k = 1;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = k++;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void example2() {

        // 풀이
        int[][] myArray = new int[5][];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new int[i + 1];
        }

        int k = 1;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = k++;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        // 내가 푼 것
        /*int intArray[][] = new int[5][];

        int cnt = 1;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new int[cnt];
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("length: "+intArray[i].length);
                intArray[i][j] = cnt++;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }*/
    }

}
