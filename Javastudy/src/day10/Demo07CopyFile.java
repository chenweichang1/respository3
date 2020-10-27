package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo07CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("D:\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\a.txt");
//        int len = 0;
//        while ((len = fileInputStream.read()) != -1) {
//            fileOutputStream.write(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        fileOutputStream.close();  // 先关写，如果写完了，肯定读完了
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("复制文件共耗时：" + (end - start) + "毫秒");
    }
}
