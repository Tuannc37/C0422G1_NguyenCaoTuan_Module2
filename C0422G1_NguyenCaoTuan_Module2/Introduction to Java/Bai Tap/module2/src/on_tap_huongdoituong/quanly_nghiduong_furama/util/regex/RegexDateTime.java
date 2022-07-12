package utils.regex;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class RegexDateTime {
    static Scanner sc = new Scanner(System.in);

    public static String inputStartDay(){
        try {
            String startDate = "";
            while (true){
                System.out.println("Nhập ngày bắt đầu:");
                startDate = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
                LocalDate localDate1 = LocalDate.parse(startDate, formatter);
                LocalDate localDate2 = LocalDate.now();
                localDate2.format(formatter);

                int geyDay = Period.between(localDate1, localDate2).getDays();
                if (geyDay > 0){
                    return startDate;
                }else {
                    throw new DateTimeException("Ngày bắt đầu phải hơn ngày hiện tại!!");
                }
            }
        }catch (DateTimeException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
