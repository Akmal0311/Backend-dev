package Talaba;

import bootcamp6.NT.gettersetter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<talaba> list = new ArrayList<>();
        talaba talab = new talaba("Komiljonov","Ahmad",24);
        list.add(talab);
        talaba talab1 = new talaba("Fozilov","Bekzod",23);
        list.add(talab1);
        talaba talab2 = new talaba("Shukrullayev","Abdulloh",29);
        list.add(talab2);
        talaba talab3 = new talaba("Sagdiyef","MuhammdaAli",16);
        list.add(talab3);
        talaba talab4 = new talaba("Komiljonov","Ahmad",22);
        list.add(talab4);
        talaba talab5 = new talaba("Ubaydullayev","Vali",25);
        list.add(talab5);
        talaba talab6 = new talaba("Abdullayev","Nizom",33);
        list.add(talab6);
        talaba talab7 = new talaba("Ergashev","Ali",20);
        list.add(talab7);
        talaba talab8 = new talaba("Azimov","Laziz",44);
        list.add(talab8);

        List<String > result = new ArrayList<>();

        result = list.stream().filter(o1 -> o1.getYosh()>=20 && o1.getYosh()<=30)
                .sorted(((o1, o2) -> {
                    if(o1.getFam().compareTo(o2.getFam())==0){
                        if(o1.getIsm().compareTo(o2.getIsm())==0) {
                            return o1.getYosh().compareTo(o2.getYosh());
                        }
                        return o1.getIsm().compareTo(o2.getIsm());
                    }
                    return o1.getFam().compareTo(o2.getFam());
                }))
                .map((o1) -> o1.getFam()+ " " + o1.getIsm()+ " " + o1.getYosh() ).collect(Collectors.toList());

        for(String l : result){
            System.out.println(l);
        }
    }
}
