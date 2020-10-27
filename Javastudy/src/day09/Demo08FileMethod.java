package day09;

import java.io.File;
import java.io.IOException;

public class Demo08FileMethod {
    public static void main(String[] args) throws IOException {
//        show01();
//        System.out.println("=======================");
//        show02();
//        System.out.println("=======================");
        show03();
    }

    private static void show03() {
        File file = new File("1");
        boolean delete = file.delete();
        System.out.println(delete);

        File file1 = new File("2");
        boolean delete1 = file1.delete();
        System.out.println(delete1);
    }

    private static void show02() {
        File file = new File("1");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

        File file1 = new File("2\\2.1");
        boolean mkdirs = file1.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show01() throws IOException {
        File file = new File("1.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
