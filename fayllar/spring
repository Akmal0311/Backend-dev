package fayllar;

import java.io.File;
import java.io.IOException;

public class yozish {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\fayllar\\yozishfayl.txt");
        System.out.println(file.exists() ? "Bu fayl mavjud" : "Bu fayl mavjud emas");
        try {
            System.out.printf(file.createNewFile() ? "%s nomli fayl ochildi!\n" : "%s nomli fayl bor edi",file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.isDirectory() ? "Bu papka": "Bu fayl");

        System.out.println(file.delete() ? "fayl ochirildi" : "bunday fayl yoq");
    }
}
