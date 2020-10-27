package day10;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("E:\\Javastudy");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
//        System.out.println(dir);
//        File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));
        File[] files = dir.listFiles((dir1, name) -> new File(dir1, name).isDirectory() || name.toLowerCase().endsWith(".java"));
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
