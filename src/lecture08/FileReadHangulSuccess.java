package lecture08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by berno579@gmail.com on 2022/05/05
 * Github : http://github.com/bee0113
 */
public class FileReadHangulSuccess {

    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("/Users/yoonjaeseung/upload/Hangul.txt");
            in = new InputStreamReader(fin, "UTF-8");
            int c;
//            int c = in.read();

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();

            in.close();
            fin.close();

        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
