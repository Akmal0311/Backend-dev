package Express;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Food[] foods = new Food[1];
        foods[0] = new Food("lavash","Mol go'shtidan sirli lavash",22000,10);

        Cafetria cafetria = new Cafetria("Evos","Oloy bozori", 50,10,false);
        cafetria.setMenu(foods);


        System.out.print("Kelayotgan odamlar sonini kiriting: ");
        int count = in.nextInt();
        System.out.printf("Ovqatning tayyor bo'lish vaqti: %.0f minut\n" ,cafetria.getMenu()[0].getTime());
        cafetria.addClient(count);
        float time = cafetria.cookTime(foods[0]);
        System.out.printf("%d ta odam kelganidan keyin, ovqat tayyor bo'lish vaqti %.1f minutga o'zgardi",count ,time);

        System.out.println("\n\n_________________________________Restaurant_______________________________________");

        Restaurant restaurant = new Restaurant("Issimo","chilonzor",50,50,3);
        restaurant.setMenu(new Food[]{new Food("Stack","Mol go'shtidan stack",60000,10)});

        System.out.print("Odamlar soni: ");
        count = in.nextInt();
        System.out.printf("\nOvqatning umimiy tayyor bo'lish vaqti: %.1f",restaurant.getMenu()[0].getTime());
        restaurant.addClient(count);

        System.out.printf("\n%d ta odam kirganindan keyin Vip xona uchun ovqatning tayyor bo'lish vaqti %.1f minutga o'zgardi",count,restaurant.cookTime(restaurant.getMenu()[0],true));

        System.out.printf("\n%d ta odam kirganindan keyin umumiy zal uchun ovqatning tayyor bo'lish vaqti %.1f minutga o'zgardi",count,restaurant.cookTime(restaurant.getMenu()[0],false));


    }
}
