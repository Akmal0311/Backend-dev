package fayllar;

import java.io.*;
import java.util.Scanner;

public class CarFayl {
    private String name;
    private String type;
    private Double cost;
    public static String carDelete(String name){
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\fayllar\\car.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream);
            while(scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return "Malumot fayldan ochirildi";
    }
    public static String carAdd(String name, String type, Double cost) throws IOException {
        CarFayl car = new CarFayl(name,type,cost);
        File file = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\fayllar\\car.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(car+"\n"));
        bufferedWriter.flush();
        return "Malumot faylga yozildi!";
    }
    public CarFayl(String name, String type, Double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car name: " + name + " Car type: "+type + " Car cost: "+ cost;
    }


}
