package lecture03;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct03 {


    public static void main(String[] args) {
        // 1. for-each문으로 작성된 프로그램을 for, while, do~while 문으로 작성
        System.out.println("1문제");
        example1();

        // 2. 10개의 정수를 저장하는 배열 tenArray를 선언하고 초기화하는 프로그램을 작성
        System.out.println("\n2문제");
        example2();
    }

    public static void example1() {
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        System.out.println("[for문]");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.print(name + " ");

        }
        System.out.println();

        System.out.println("[while문]");
        int cnt = 0;
        while (cnt < names.length) {
            String name2 = names[cnt];
            System.out.print(name2 + " ");
            cnt++;
        }
        System.out.println();

        System.out.println("[do~While문]");
        int cnt2 = 0;
        do {
            String name3 = names[cnt2];
            System.out.print(name3 + " ");
            cnt2++;

        } while (cnt2 < names.length);

    }

    public static void example2() {
        Scanner scanner = new Scanner(System.in);
        int tenArray[] = new int[10];

        String cmd = "";

        while (true) {
            System.out.print("시작하시려면 start 입력해주세요.>>\t");
            cmd = scanner.nextLine();

            if (cmd.equals("reboot")) {
                continue;
            }
            if (cmd.equals("exit")) {
                System.out.print("종료하시겠습니까?>>\t");
                String confirmYn = scanner.nextLine();
                if (confirmYn.equals("Y") || confirmYn.equals("y")) {
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
                }
            }
            if (cmd.equals("start")) {
                System.out.print("정수 10개를 입력해주세요.>>\t");
                for (int i = 0; i < tenArray.length; i++) {
                    tenArray[i] = scanner.nextInt();
                }

                System.out.println("저장된 정수 10개>>");
                for (int i = 0; i < tenArray.length; i++) {
                    System.out.println("[" + i + "]인덱스에 저장된 값:" + tenArray[i]);
                }
                System.out.println();
                break;
            }

        }
        System.out.println("종료...");
        scanner.close();
    }

}
