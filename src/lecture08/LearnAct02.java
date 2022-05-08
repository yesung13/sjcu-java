package lecture08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by berno579@gmail.com on 2022/05/06
 * Github : http://github.com/bee0113
 */
public class LearnAct02 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        FileInputStream fin = null;

        try {
            fout = new FileOutputStream("/Users/yoonjaeseung/upload/test.dat");

            byte b[] = {3, 5};

            for (int i = 0; i < b.length; i++) {
                try {
                    fout.write(b[i]);
                } catch (IOException e) {
                    throw e;
                }
            }
            fout.close();

            fin = new FileInputStream("/Users/yoonjaeseung/upload/test.dat");
            int c;
            while ((c = fin.read()) != -1) {
                System.out.println(c);
            }
            fin.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
