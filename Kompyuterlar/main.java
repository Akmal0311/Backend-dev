package Kompyuterlar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Kompyuter> kompyuter = new ArrayList<>();
        Kompyuter kompyuter1 = new Kompyuter("i5",1000,8,"Msi",900);
        kompyuter.add(kompyuter1);
        Kompyuter kompyuter2 = new Kompyuter("i7",512,16,"Apple",2200);
        kompyuter.add(kompyuter2);
        Kompyuter kompyuter3 = new Kompyuter("i5",512,8,"hp",700);
        kompyuter.add(kompyuter3);
        Kompyuter kompyuter4 = new Kompyuter("i3",256,4,"Toshiba",300);
        kompyuter.add(kompyuter4);
        Kompyuter kompyuter5 = new Kompyuter("i9",3000,32,"Dell",3500);
        kompyuter.add(kompyuter5);
        Kompyuter kompyuter6 = new Kompyuter("i7",1000,16,"Acer",1500);
        kompyuter.add(kompyuter6);
        Kompyuter kompyuter7 = new Kompyuter("i5",256,8,"Sony",900);
        kompyuter.add(kompyuter7);
        Kompyuter kompyuter8 = new Kompyuter("i7",1000,16,"Samsung",1200);
        kompyuter.add(kompyuter8);
        Kompyuter kompyuter9 = new Kompyuter("i9",2000,32,"Asus",3300);
        kompyuter.add(kompyuter9);
        Kompyuter kompyuter10 = new Kompyuter("i3",500,4,"Lenovo",900);
        kompyuter.add(kompyuter10);

        List<String> kompyuterList;
        kompyuterList = kompyuter.stream().sorted(((o1, o2) -> {
                    if (o1.getProcessor().compareTo(o2.getProcessor()) == 0) {
                        if (o1.getStorage().compareTo(o2.getStorage()) == 0) {
                            if (o1.getRam().compareTo(o2.getRam()) == 0) {
                                if (o1.getBrand().compareTo(o2.getBrand()) == 0) {
                                    return o1.getCost().compareTo(o2.getCost());
                                } else {
                                    return o1.getBrand().compareTo(o2.getBrand());
                                }
                            } else {
                                return o1.getRam().compareTo(o2.getRam());
                            }
                        } else {
                            return o1.getStorage().compareTo(o2.getStorage());
                        }
                    } else {
                        return o1.getProcessor().compareTo(o2.getProcessor());
                    }
                })).map(Kompyuter::getProcessor).distinct()
                .collect(Collectors.toList());

        int sum = kompyuter.stream().map(Kompyuter::getCost).reduce(0, Integer::sum);

        for(String k: kompyuterList){
            System.out.println(k);
        }
        System.out.println("\nsum: "+sum);
    }
}
