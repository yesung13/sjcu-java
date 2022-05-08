package lecture08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by berno579@gmail.com on 2022/05/05
 * Github : http://github.com/bee0113
 */
public class FileWriterEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        int c;

        try {
            fout = new FileWriter("/Users/yoonjaeseung/upload/test.txt");
            while (true) {
                String line = scanner.nextLine();

                if (line.length() == 0) {
                    break;
                }
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            fout.close();

        } catch (IOException e) {
            System.out.println("입출력 오류");
        }

    }
}
