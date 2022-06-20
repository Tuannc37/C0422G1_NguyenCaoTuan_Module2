package on_tap_huongdoituong.quanlyphuongtien;

import javafx.scene.transform.Scale;
import on_tap_huongdoituong.quanlycanbo.CanBo;
import on_tap_huongdoituong.quanlycanbo.CongNhan;
import on_tap_huongdoituong.quanlycanbo.KiSu;
import on_tap_huongdoituong.quanlycanbo.NhanVienPhucVu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhuongTien {
    static List<PhuongTien> phuongTienList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            System.out.println("Nhập vào lựa chọn");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    themMoiPhuongTien();
                    break;

                case 2:
                    hienThi();
                    break;

                case 3:
                    xoaPhuongTien();
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

    public static void showMenu(){
        System.out.println("1.Thêm mới phương tiện");
        System.out.println("2.Hiển thị phương tiện");
        System.out.println("3.Xóa phương tiện");
        System.out.println("5.Thoát");
    }

    public static PhuongTien createPhuongTien(){
        PhuongTien phuongTien;
        System.out.println("1.Thêm xe tải");
        System.out.println("2.Thêm Otô");
        System.out.println("3.Thêm xe máy");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                phuongTien = new XeTai();
                break;
            case 2:
                phuongTien = new Oto();
                break;
            default:
                phuongTien = new XeMay();
                break;
        }
        phuongTien.input();
        return phuongTien;
    }

    public static void themMoiPhuongTien(){
        System.out.println("Nhập số phương tiện cần thêm");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            PhuongTien phuongTien = createPhuongTien();
            phuongTienList.add(phuongTien);
        }
    }

    public static void hienThi(){
        for(PhuongTien phuongTien:phuongTienList) phuongTien.display();
    }
    public static void xoaPhuongTien(){
        
    }
}
