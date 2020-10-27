package day10;

import java.io.File;

public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\Javastudy");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
//                String name = f.getName();
//                String path = f.getPath();
                String string = f.toString();
                if (string.toLowerCase().endsWith(".java")) {
                    System.out.println(f);
                }
            }
        }
    }


}
