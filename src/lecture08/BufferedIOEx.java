package lecture08;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {

    public static void main(String[] args) {
        FileReader fin = null;
        int c;

        try {
            fin = new FileReader("c:\\upload\\temp\\test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5);

            while ((c = fin.read()) != -1) {
                out.write(c);
            }

            new Scanner(System.in).nextLine();
            out.flush(); // 버퍼에 남아있는 문자를 모두 출력하는것을 기다림
            fin.close();
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
