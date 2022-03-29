package fayllar;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class oqish {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\fayllar\\spring");
        System.out.println(file.toURI());
        try {
            URI uri = new URI("file:/C:/sers/User/IdeaProjects/java1/src/fayllar/spring");
            file = new File(uri);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(file.toURI());
//        FileReader reader = new FileReader(file);

//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String s = bufferedReader.readLine();
//        while(s!=null){
//            System.out.println(s);
//            s = bufferedReader.readLine();
//        }
//        try {
//            InputStream inputStream = new FileInputStream(file);
//            Scanner scanner = new Scanner(inputStream);
//            while(scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
        try {
            List<String> lines = Files.readAllLines(Paths.get(file.toURI()));
//            String result = new String(Files.readAllBytes(Paths.get(file.toURI())));
//            String[] words = result.split("\\r?\\n");
//            System.out.println(Arrays.toString(words));
//            System.out.println(result);
            lines.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
