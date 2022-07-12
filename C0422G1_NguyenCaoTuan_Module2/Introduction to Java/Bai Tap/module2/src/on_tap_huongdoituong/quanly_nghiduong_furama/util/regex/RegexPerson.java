package utils.regex;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class RegexPerson {
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static Scanner sc = new Scanner(System.in);

    public static String inputEmail(){
        System.out.println("Nhập email:");
        return RegexData.regexStr(sc.nextLine(),REGEX_EMAIL,"Bạn đã nhập sai định dạng, email phải có dạng abc@gmail.com !!!");
    }

    public static int inputIntNumber(){
        int num;
        while (true){
            try {
                num = Integer.parseInt(sc.nextLine());
                return num;
            }catch (NumberFormatException e){
                System.err.println("Nhập lại");
            }
        }
    }

    public static double inputDouNumber(){
        double num;
        while (true){
            try {
                num = Double.parseDouble(sc.nextLine());
                return num;
            }catch (NumberFormatException e){
                System.err.println("Nhập lại");
            }
        }
    }

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year < 18 || year > 100){
            throw new Exception();
        }
    }

    public static String getDateOfBirth(){
        String dateOfBirth;
        while (true){
            try {
                System.out.println("Nhập ngày sinh:");
                dateOfBirth = sc.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (Exception e) {
                System.err.println("Ngày sinh phải có dạng dd/MM/yyyy");
            }
        }
        return dateOfBirth;
    }
}
