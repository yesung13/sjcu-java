package lecture08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by berno579@gmail.com on 2022/05/06
 * Github : http://github.com/bee0113
 */
public class FileInputStreamEx {
    public static void main(String[] args) {

        byte b[] = new byte[6];
        try {
            FileInputStream fin = new FileInputStream("/Users/yoonjaeseung/upload/test.out");
            int n = 0, c;
            while ((c = fin.read()) != -1) {
                b[n] = (byte) c;
                n++;
                System.out.println(c);
            }
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
            fin.close();

        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
