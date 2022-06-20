package on_tap_huongdoituong.quanlycanbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    static List<CanBo> canBoList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            System.out.println("Nhập vào lựa chọn");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    inputData();
                    break;

                case 2:
                    serchByName();
                    break;

                case 3:
                    showData();
                    break;

                case 4:
                    System.out.println("Thoat!");
                    break;

                default:
                    System.out.println("Bạn đã nhập sai.Vui lòng nhập lại");
                    break;
            }

        }while(choose != 4);
    }

    public static void inputData() {
        System.out.println("Nhập số cán bộ cần thêm");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            CanBo canBo = createCanbo();
            canBoList.add(canBo);
        }
    }
    public static CanBo createCanbo(){
        CanBo canBo;
        System.out.println("1.Nhập thông tin Công Nhân");
        System.out.println("2.Nhập thông tin Kĩ Sư");
        System.out.println("3.Nhập thông tin Nhân Viên Phục Vụ");
        System.out.println("Chon: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                canBo = new CongNhan();
                break;
            case 2:
                canBo = new KiSu();
                break;
            default:
                canBo = new NhanVienPhucVu();
                break;
        }
        canBo.input();
        return canBo;
    }

    public static void serchByName() {
        System.out.println("Nhập vào tên cán bộ cần tìm kiếm");
        String fullname = scanner.nextLine();
        for(CanBo canBo:canBoList){
            if(canBo.getFullname().equalsIgnoreCase(fullname)){
                canBo.display();
            }
        }
    }

    public static void showData() {
        for(CanBo canBo:canBoList) canBo.display();
    }

    public static void showMenu(){
        System.out.println("1 .Nhập thông tin cán bộ");
        System.out.println("2 .Tìm kiếm theo tên");
        System.out.println("3 .Hiển thị thông tin");
        System.out.println("4 .Thoát");
        System.out.println("Chon: ");
    }
}
