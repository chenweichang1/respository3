package day10;

import java.io.FileReader;
import java.io.IOException;

public class Demo08Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\a.txt");
//        int len = 0;
//        while ((len = fileReader.read()) != -1) {
//            System.out.print((char) len);
//        }

        char[] chars = new char[1024];
        int len = 0;
        while ((len = fileReader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fileReader.close();
    }
}
