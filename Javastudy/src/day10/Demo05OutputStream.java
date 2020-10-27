package day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo05OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\Javastudy\\a.txt");
        fos.write(97);
        fos.close();

        FileOutputStream fos1 = new FileOutputStream("E:\\Javastudy\\b.txt");
        fos1.write(49);
        fos1.write(48);
        fos1.write(48);
        fos1.close();

        FileOutputStream fos2 = new FileOutputStream("E:\\Javastudy\\c.txt");
        byte[] bytes = {65, 66, 67, 68, 69};
        fos2.write(bytes);
        fos2.close();

        FileOutputStream fos3 = new FileOutputStream("E:\\Javastudy\\d.txt");
        byte[] bytes1 = {65, 66, 67, 68, 69};
        fos3.write(bytes1, 1, 2);
        fos3.close();

        FileOutputStream fos4 = new FileOutputStream("E:\\Javastudy\\e.txt");
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2)); //[-28, -67, -96, -27, -91, -67]
        fos4.write(bytes2);
        fos4.close();

        FileOutputStream fos5 = new FileOutputStream("E:\\Javastudy\\f.txt", true);
        for (int i = 0; i < 10; i++) {
            fos5.write("您好".getBytes());
            fos5.write("\r\n".getBytes());
        }
        fos5.close();

    }
}
