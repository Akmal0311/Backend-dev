package bootcamp10.NT;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        newLaptop laptop = new newLaptop();

        System.out.print("laptop model: ");
        laptop.setModel(in.next());

        System.out.print("price: ");
        laptop.setPrice(in.nextInt());

        System.out.print("processor: ");
        laptop.setProcessor(in.next());

        System.out.print("videokarta: ");
        laptop.setVideokarta(in.next());

        System.out.print("ram: ");
        int a = in.nextInt();
        laptop.setRam(a);

        System.out.print("storage: ");
        int b = in.nextInt();
        laptop.setStorage(b);

        laptop.Forcoding(b,a);

        laptop.toString();
        }
}
