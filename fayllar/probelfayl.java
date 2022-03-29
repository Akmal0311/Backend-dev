package fayllar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class probelfayl {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\fayllar\\car.txt");
        List<String> lines = Files.readAllLines(Paths.get(file.toURI()));
        boolean tf = true;
        String res = "";
        for(String s: lines){
            for(int i=0; i<s.length(); i++) {
                if (tf && s.charAt(i) == ' ') {
                    tf = false;
                    res += s.charAt(i);
                }else if(s.charAt(i)!=' ') {
                    tf = true;
                    res += s.charAt(i);
                }
            }
            res += "\n";
        }
        System.out.println(res);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(res);
        bufferedWriter.flush();
    }
}
