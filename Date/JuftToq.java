package Date;

import sun.util.resources.LocaleData;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.util.Scanner;

public class JuftToq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Darsingizni toq kunga qo'yasizmi yoki juft kungami?");
//        System.out.print("\n1.toq || 2.juft");
//        int a = scanner.nextInt();
//        System.out.print("Davomiylik kunini kiriting: ");
//        int b = scanner.nextInt();
//        System.out.print("Boshlanish sanasini kiriting [yyyy-mm-dd]: ");
//        String c = scanner.nextLine();

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

    }
}
