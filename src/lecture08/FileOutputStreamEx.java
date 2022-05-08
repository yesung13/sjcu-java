package lecture08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by berno579@gmail.com on 2022/05/06
 * Github : http://github.com/bee0113
 */
public class FileOutputStreamEx {
    public static void main(String[] args) {

        byte b[] = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fout = new FileOutputStream("/Users/yoonjaeseung/upload/test.out");
            for (int i = 0; i < b.length; i++) {
                fout.write(b[i]);
            }
            fout.close();

        } catch (IOException e) {
            System.out.println("Error");
            return;
        }

        System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
    }
}
