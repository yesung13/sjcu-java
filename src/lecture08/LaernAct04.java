package lecture08;

import java.io.File;

/**
 * c:\Temp\test.txt 파일이 존재하는 경우
 * 화면에 “exist”를 출력하고, 아닌 경우 “no”를 출력하는
 * 프로그램을 작성해보세요.
 */

public class LaernAct04 {

    public static void main(String[] args) {
        File f = new File("c:\\Temp\\test.txt");

        if (f.isFile()) {
            System.out.println("exist");
        } else {
            System.out.println("no");
        }
    }

}
