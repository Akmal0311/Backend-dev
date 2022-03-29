package fayllar;

import java.io.File;

public class Fayl {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\spring1");
//        System.out.println(file.exists());
//        System.out.println(file.getAbsolutePath());
//        for (File f: file.listFiles()){
//            System.out.println(f.getName()+ (f.isDirectory() ?  " >>> " : ""));
//            if(f.listFiles()!=null)
//                for(File f1 : f.listFiles()){
//                    System.out.println("   " + f1.getName());
//                }
//        }
        if(file.mkdir()){
            System.out.println("Yangi fayl ochildi");
        }else{
            System.out.println("Bunday fayl mavjud");
        }
    }
}
