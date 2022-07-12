package utils.regex;

import java.util.Scanner;

public class RegexFacility {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static Scanner sc = new Scanner(System.in);

    public static String inputIdVilla(){
        System.out.println("Nhập id, mã Villa:");
        return RegexData.regexStr(sc.nextLine(),REGEX_ID_VILLA,"Bạn đã nhập sai định dạng, mã dịch vụ phải có dạng: SVXX-YYYY!!!");
    }

    public static String inputIdHouse(){
        System.out.println("Nhập id, mã House:");
        return RegexData.regexStr(sc.nextLine(),REGEX_ID_HOUSE,"Bạn đã nhập sai định dạng, mã dịch vụ phải có dạng: SVHO-YYYY!!!");
    }

    public static String inputIdRoom(){
        System.out.println("Nhập id, mã Room:");
        return RegexData.regexStr(sc.nextLine(),REGEX_ID_ROOM,"Bạn đã nhập sai định dạng, mã dịch vụ phải có dạng: SVRO-YYYY!!!");
    }

    public static String inputNameFacility(){
        System.out.println("Nhập tên dịch vụ:");
        return RegexData.regexStr(sc.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng, tên dịch vụ phải viết hoa ký tự đầu!!!");
    }

    public static String inputArea(){
        System.out.println("Nhập diện tích sử dụng:");
        return RegexData.regexStr(sc.nextLine(),REGEX_AREA,"Bạn đã nhập sai định dạng, diện tích sử dụng phải lớn hơn 30m2!!!");
    }

    public static String inputAreaOfPool(){
        System.out.println("Nhập diện tích hồ bơi:");
        return RegexData.regexStr(sc.nextLine(),REGEX_AREA,"Bạn đã nhập sai định dạng, diện tích hồ bơi phải lớn hơn 30m2!!!");
    }

    public static int inputPrice() throws Exception {
        int price;
        while (true){
            System.out.println("Nhập giá:");
            try {
                price = Integer.parseInt(sc.nextLine());
                if (price > 0){
                    return price;
                }else {
                    throw new Exception();
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    public static String inputAmount(){
        System.out.println("Số lượng người:");
        return RegexData.regexStr(sc.nextLine(),REGEX_AMOUNT,"Bạn đã nhập sai định dạng, số người phải từ 1 - 19!!!");
    }

    public static String inputStyle(){
        System.out.println("Nhập kiểu dịch vụ:");
        return RegexData.regexStr(sc.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng, kiểu phòng phải bắt đầu bằng ký tự viết hoa!!!");
    }

    public static String inputStandard(){
        System.out.println("Nhập tiêu chuẩn dịch vụ:");
        return RegexData.regexStr(sc.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng, tiêu chuẩn phòng phải bắt đầu bằng ký tự viết hoa!!!");
    }

    public static String inputFOC(){
        System.out.println("Nhập dịch vụ miễn phí:");
        return RegexData.regexStr(sc.nextLine(),REGEX_STR,"Bạn đã nhập sai định dạng, dịch vụ miễn phí phải bắt đầu bằng ký tự viết hoa!!!");
    }

    public static String inputFloor(){
        System.out.println("Nhập số tầng:");
        return RegexData.regexStr(sc.nextLine(),REGEX_INT,"Bạn đã nhập sai định dạng, số tầng phải là số nguyên dương!!!");
    }
}
