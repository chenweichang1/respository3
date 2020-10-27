package day10;

import java.io.FileWriter;
import java.io.IOException;

public class Demo09Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\a.txt", true);
        fileWriter.write(97);
//        fileWriter.flush();
        fileWriter.close();

        FileWriter fileWriter1 = new FileWriter("D:\\b.txt", true);
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        fileWriter1.write(chars, 1, 3);
        for (int i = 0; i < 10; i++) {
            fileWriter1.write("大数据大数据的哈技术的" + i + "\r\n");
        }
//        fileWriter1.flush();
        fileWriter1.close();
    }
}
