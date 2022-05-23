package sample;

import java.util.Scanner;

/**
 * 1. "1. 콜라 850원, 2. 사이다 800원, 3. 환타 750원, 4. 생수 500원" 메시지 출력
 * <p>
 * 2. 사용자가 돈을 자판기에 넣습니다. 받을 돈을 입력받습니다.
 * <p>
 * 3. 사용자로부터 마실 음료를 선택하면 잔돈을 줄 때 천원, 오백원, 백원짜리 몇개를 줘야하는지 계산하여 출력하세요.
 * <p>
 * 입력한 금액이 선택한 메뉴의 가격보다 부족하면 돈이 부족하다는 문장을 출력하세요.
 * <p>
 * 자판기에는 기본적으로 천원 : 5장, 오백원 : 10개, 백원 : 10개, 50원: 10개, 10원 : 30개가 있습니다.
 * <p>
 * 4. 잔돈을 주고 나면 다시 1번으로 돌아갑니다.
 * <p>
 * <p>
 * 1. 콜라 850원, 2. 사이다 800원, 3. 환타 750원, 4. 생수 500원
 * <p>
 * 금액을 입력하세요 : 5000원
 * <p>
 * 메뉴를 선택하세요 : 1
 * <p>
 * 잔돈 : 4150원
 * <p>
 * 천원 : 1개, 100원 : 1개, 50원 : 1개
 */

public class ScriptSample {

    public static final int MAX = 5;

    // 전역변수
    static int[] rn = new int[MAX]; // 순번
    static int[] moneyBox = new int[MAX]; // 돈통의 현금
    static int[] moneyCnt = new int[MAX]; // 돈통의 현금 갯수

    // 처음 자판기를 초기화 하는 함수
    public static void initialize() {
        moneyBox[0] = 1000;
        moneyCnt[0] = 5;
        moneyBox[1] = 500;
        moneyCnt[1] = 10;
        moneyBox[2] = 100;
        moneyCnt[2] = 10;
        moneyBox[3] = 50;
        moneyCnt[3] = 10;
        moneyBox[4] = 10;
        moneyCnt[4] = 30;
    }

    public static void vendingMachine() {
        Scanner sc = new Scanner(System.in);

        String[] menuNms = {"콜라", "사이다", "환타", "생수"};
        int[] prices = {850, 800, 750, 500};
        int charge = 0;

        while (true) {
            System.out.println("==================================================");
            System.out.println("\t\t\t\t\t[자판기]");

            for (int i = 0; i < menuNms.length; i++) {
                System.out.print((i + 1) + "." + menuNms[i] + " " + prices[i] + "원 ");
                rn[i] = i + 1;
            }

            System.out.println();
            System.out.println("==================================================");

            System.out.print("금액을 입력하세요 : ");
            int pay = sc.nextInt();

            if (pay == -1) {
                System.out.println("<<종료>>");
                break;
            }

            System.out.print("메뉴를 선택하세요 : ");
            int menuNum = sc.nextInt();
//            if(menuNum < 0 || menuNum > rn.length) {
//                System.out.println("잘못 선택하셨습니다.");
//                continue;
//            }

            // 돈이 충분한가?
            if (pay >= prices[menuNum - 1]) {
                charge = pay - prices[menuNum - 1];

                System.out.println("잔돈 : " + charge);

                int coin = 0;
                for (int arr : moneyBox) {
                    coin = charge / arr;
                    charge %= arr;

                    if (coin > 0) {
                        System.out.print(arr + "원: " + coin + "개 ");
                    }
                }
                System.out.println();

            } else {
                System.out.println("잔액이 부족합니다!");
            }

        }
    }

    public static void main(String[] args) {
        initialize();
        vendingMachine();
        return;
    }
}
