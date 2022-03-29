package Regex;

import com.sun.xml.internal.ws.api.addressing.OneWayFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Regex\\nomer.txt");
        File outFile = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Regex\\outNomer.txt");
        try{
            if(outFile.createNewFile()) System.out.println("OutNomer fayl ochildi");
            List<String> nums = Files.readAllLines(Paths.get(file.toURI()));


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
