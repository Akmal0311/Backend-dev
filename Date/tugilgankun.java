package Date;


import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Math.abs;

public class tugilgankun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yil: ");
        int a = scanner.nextInt();
        System.out.print("Oy: ");
        int b = scanner.nextInt();
        System.out.print("Kun: ");
        int c = scanner.nextInt();

        if (hisob(a, b, c) == 0) {
            System.out.println("Siz hali tug'ilmagansiz :)");
        } else {
            System.out.println("Siz " + abs(hisob(a, b, c)) + " kun yashadingiz!");
        }
    }

    static int hisob(int a, int b, int c) {
        LocalDate localDate = LocalDate.now();
        String s = localDate.toString();

        int y = Integer.parseInt(s.substring(0, 4));
        int o = Integer.parseInt(s.substring(5, 7));
        int k = Integer.parseInt(s.substring(8, 10));

        int kun = 0;

        if (a > y) {
            if (b > o) {
                if (c > k) return 0;
                else {
                    while (k != c) {
                        kun++;
                        k++;
                    }
                }
            } else {
                while (o != b) {
                    kun += 30;
                    o++;
                }
            }
        } else {
            while (y != a) {
                kun += 365;
                y++;
            }
        }
        return kun;
    }
}