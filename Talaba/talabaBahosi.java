package Talaba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class talabaBahosi {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Talaba\\baho.txt");
        File outFile = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Talaba\\outputBaho.txt");

        try{
            List<String> list = Files.readAllLines(Paths.get(files.toURI()));
            FileWriter fileWriter = new FileWriter(outFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String l: list) {
                if(l.contains("5")){
                    bufferedWriter.write(l+"\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
