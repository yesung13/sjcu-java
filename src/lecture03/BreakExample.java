package lecture03;

import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/03/16
 * Github : http://github.com/bee0113
 */
public class BreakExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");

        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if(text.equals("exit")){
                break;
            }
        }
        System.out.println("종료합니다.....");

        scanner.close();
    }
}
