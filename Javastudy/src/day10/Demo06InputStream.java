package day10;


import java.io.FileInputStream;
import java.io.IOException;

public class Demo06InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\a.txt");
        /*int len = fileInputStream.read();
        System.out.println(len); // 97 a

        len = fileInputStream.read();
        System.out.println(len); // 98 b

        len = fileInputStream.read();
        System.out.println(len); // 99 c

        len = fileInputStream.read();
        System.out.println(len); // -1*/

        int len = 0;
        while ((len = fileInputStream.read()) != -1) {
            System.out.print(len);
            System.out.print((char) len);
            System.out.println();
        }

        fileInputStream.close();

        System.out.println("===========================");

        FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\b.txt");
        byte[] bytes = new byte[1024];
        int len1 = 0;
        while ((len1 = fileInputStream1.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len1));
        }
    }
}
