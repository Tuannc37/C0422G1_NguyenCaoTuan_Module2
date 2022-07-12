package Mobile.Service.Implement;


import Mobile.Model.Mobile.AuthenticPhone;
import Mobile.Model.Mobile.HandCarriedPhone;
import Mobile.Model.Mobile.Mobile;
import Mobile.Service.IMobile;
import Mobile.Uliti.IncreaseID;
import Mobile.Uliti.InsuranceArea;
import Mobile.Uliti.ReadAndWrite;
import Mobile.Uliti.Regex;

import java.util.*;

public class MobileService implements IMobile {
    static Scanner scanner = new Scanner(System.in);
    public static final String PATH_FILE_PHONE = "bai_tap/src/Mobile/Data/MobileCSV.csv";
    @Override
    public void add() {
        do {
            System.out.println("=====Thêm mới=====\n" +
                    "1. Thêm hàng xách tay\n" +
                    "2. Thêm hàng chính hãng\n" +
                    "3. Quay lại menu");
            System.out.println("****Nhập lựa chọn****");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addHandCarrie();
                    break;
                case "2":
                    addAuthentic();
                    break;
                case "3":
                    return;
                default:
                    System.out.printf("Chỉ chọn 1 - 3 \n");
            }
        } while (true);


    }

    @Override
    public void delete() {
        Boolean flag = false;
        List<Mobile> mobileList = ReadAndWrite.readFileList(PATH_FILE_PHONE);
        System.out.println("nhập id điện thoại cần xóa");
        String id = scanner.nextLine();
        for (Mobile e : mobileList) {
            if (e.getId().equals(id)) {
                System.out.println("Bạn muốn xóa hay không: \n" +
                        "1. Xóa\n" +
                        "2. không xóa");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    flag = true;
                    mobileList.remove(e);
                    System.out.println("Đã xóa");
                    ReadAndWrite.writeList(mobileList, PATH_FILE_PHONE, false);
                    System.out.println("Cập nhập thành công");
                    break;
                } else if (choose == 2) {
                    System.out.println(" không xóa");
                    display();
                    break;
                } else {
                    try {
                        throw new NumberFormatException("Không đúng định dạng");
                    } catch (NumberFormatException exception) {
                        System.out.println("Chỉ chọn 1 hoạc 2");
                    }
                    break;
                }
            }
        }

    }

    @Override
    public void display() {
        List<Mobile> mobileList = ReadAndWrite.readFileList(PATH_FILE_PHONE);
        if (mobileList.isEmpty()){
            System.out.println("Chưa có đt được thêm vào: ");
        }else
            for (Mobile e : mobileList) {
                System.out.println(e);
            }
    }


    @Override
    public void find() {
        List<Mobile> mobileList = ReadAndWrite.readFileList(PATH_FILE_PHONE);
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Tìm theo id" +
                    "\n 2.Tìm theo tên điện thoại" +
                    "\n 3.Exit");
            Scanner scanner = new Scanner(System.in);
            int index =-1;
            System.out.println("Chọn chức năng");
            String choose =scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Nhập id cần tìm");
                    String findID = scanner.nextLine();
                    for (int i = 0; i< mobileList.size(); i++){
                        if (findID.equals(mobileList.get(i).getId())){
                            index = 1;
                            System.out.println(mobileList.get(i));
                        }
                    }if (index == -1){
                    System.out.println("Không tìm thấy");
                }
                    break;
                case "2":
                    System.out.println("Tên điện thoại cần tìm");
                    String findName = scanner.nextLine();
                    for (int i = 0; i< mobileList.size(); i++){
                        if ((mobileList.get(i).getName()).contains(findName)){
                            System.out.println(mobileList.get(i));
                        }
                    }if (index == -1){
                    System.out.println("Không tìm thấy");
                }
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Chọn 1 - 3");
            }
        } while (true);

    }
    private void addAuthentic(){

        String id;
        id= IncreaseID.increaseID()+"";
        System.out.println("Nhập tên điện thoai: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        String cost = Regex.inputNumber();
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(Regex.inputNumber());
        System.out.println("Nhập hãng: ");
        String brand = Regex.checkStr();
        System.out.println("Thời gian bảo hành: ");
        String insuranceTime = scanner.nextLine();
        System.out.println("Khu vực bảo hành");
        String insuranceArea = InsuranceArea.area();
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new AuthenticPhone(id,name,cost,quantity,brand,insuranceTime,insuranceArea));
        ReadAndWrite.writeList(mobileList, PATH_FILE_PHONE, true);
        System.out.println("Thêm mới thành công");
    }
    private void addHandCarrie(){
        String id;
        id= IncreaseID.increaseID()+"";
        System.out.println("Nhập tên điện thoai: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        String cost = Regex.inputNumber();
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(Regex.inputNumber());
        System.out.println("Nhập hãng: ");
        String brand = Regex.checkStr();
        System.out.println("Nhập quốc gia: ");
        String country = Regex.checkStr();
        System.out.println("Nhập tình trạng máy: ");
        String status = Regex.checkStr();
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new HandCarriedPhone(id, name, cost , quantity, brand, country,status));
        ReadAndWrite.writeList(mobileList, PATH_FILE_PHONE, true);
        System.out.println("Thêm mới thành công");
    }
}
