package fayllar;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static fayllar.CarFayl.*;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\fayllar\\car.txt");
        boolean tf = true;
        while(tf) {
            System.out.print("1.Car add // 2.Car delete// 3.view all data // 4.Exit : ");
            int a = in.nextInt();
            switch (a){
                case 1:
                    System.out.print("Car name: ");
                    String sn = in.next();
                    System.out.print("Car type: ");
                    String st = in.next();
                    System.out.print("Car cost: ");
                    Double c = in.nextDouble();
                    System.out.println(carAdd(sn,st,c));
                    break;
                case 2:
                    System.out.print("Car name: ");
                    String s = in.next();

                    break;
                case 3:
                    List<String> lines = Files.readAllLines(Paths.get(file.toURI()));
                    lines.forEach(System.out::println);
                    break;
                default:
                    tf = false;
                    break;
            }
        }

    }
}
