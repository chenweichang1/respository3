package day10;

import java.io.File;

public class Demo03Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\Javastudy");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }


}
