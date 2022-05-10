package lecture08;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/05/06
 * Github : http://github.com/bee0113
 */
public class LearnAct02 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fout = null;
        FileInputStream fin = null;

        try {
//            fout = new FileOutputStream("/Users/yoonjaeseung/upload/test.dat");
            fout = new FileOutputStream("C:\\upload\\temp\\test.dat");

            byte b[] = {3, 5};

            for (int i = 0; i < b.length; i++) {
                try {
                    fout.write(b[i]);
                } catch (IOException e) {
                    throw e;
                }
            }
            fout.close();

//            fin = new FileInputStream("/Users/yoonjaeseung/upload/test.dat");
            fin = new FileInputStream("C:\\upload\\temp\\test.dat");
            InputStreamReader in = new InputStreamReader(fin, StandardCharsets.UTF_8);
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c);
            }
            in.close();
            fin.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
