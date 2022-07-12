package Hospital.HospitalService;

import Hospital.HospitalModel.People.FileHospital;
import Hospital.HospitalModel.People.NomarlFile;
import Hospital.HospitalModel.People.VipFile;
import Hospital.HospitalUliti.ReadAndWriteFileHospital;
import Hospital.HospitalUliti.RegexHost;
import Hospital.HospitalUliti.VipType;
import Mobile.Model.Mobile.HandCarriedPhone;
import Mobile.Model.Mobile.Mobile;
import Mobile.Uliti.IncreaseID;
import Mobile.Uliti.ReadAndWrite;
import Mobile.Uliti.Regex;
import jdk.nashorn.internal.runtime.regexp.RegExpFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService implements IFile{
    static Scanner scanner = new Scanner(System.in);
    public static final String PATH_FILE_HOSPITAL= "bai_tap/src/Hospital/HospitalDaTa/FileHospital.csv";
    @Override
    public void addNew() {
        do {
            System.out.println("=====Thêm mới=====\n" +
                    "1. Thêm  hồ sơ thường\n" +
                    "2. Thêm hồ sơ VIP\n" +
                    "3. Quay lại menu");
            System.out.println("****Nhập lựa chọn****");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addNormalFile();
                    break;
                case "2":
                    addVipFile();
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
        List<FileHospital> fileHospitalList = ReadAndWriteFileHospital.readFileList(PATH_FILE_HOSPITAL);
        System.out.println("nhập id điện thoại cần xóa");
        String id = scanner.nextLine();
        for (FileHospital e : fileHospitalList) {
            if (e.getId().equals(id)) {
                System.out.println("Bạn muốn xóa hay không: \n" +
                        "1. Xóa\n" +
                        "2. không xóa");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    flag = true;
                    fileHospitalList.remove(e);
                    System.out.println("Đã xóa");
                    ReadAndWrite.writeList(fileHospitalList, PATH_FILE_HOSPITAL, false);
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
        List<FileHospital> fileHospitalList = ReadAndWriteFileHospital.readFileList(PATH_FILE_HOSPITAL);
        if (fileHospitalList.isEmpty()){
            System.out.println("Chưa có đt được thêm vào: ");
        }else
            for (FileHospital e : fileHospitalList) {
                System.out.println(e);
            }
    }


    private void addNormalFile(){
        String id;
        id= Hospital.HospitalUliti.IncreaseID.increaseID() +"";
        String codeFile;
        while (true){
            System.out.println("Nhập bênh án (BA-xxxx): ");
            codeFile = scanner.nextLine();
            if (RegexHost.checkCodeFile(codeFile)){
              break;
                } else {
                System.out.println("Mã bện án nhập sai");
            }
        }
        System.out.println("Tên bệnh nhân ");
        String name = scanner.nextLine();
        System.out.println("Ngày nhập viện: ");
        String dayIn = RegexHost.inputDay();
        System.out.println("Ngày ra viện: ");
        String dayOut = RegexHost.inputDay();
        System.out.println("Lý do: ");
        String reason= scanner.nextLine();
        System.out.println("phí nằm viện: ");
        String cost = RegexHost.inputNumber();
        List<FileHospital> fileList = new ArrayList<>();
        fileList.add(new NomarlFile(id,codeFile,name,dayIn,dayOut,reason,cost));
        ReadAndWriteFileHospital.writeList(fileList, PATH_FILE_HOSPITAL, true);
        System.out.println("Thêm mới thành công");
    }
    private void addVipFile(){
        String id;
        id= IncreaseID.increaseID()+"";
        System.out.println("Nhập mã bện án: ");
        String codeFile = scanner.nextLine();
        System.out.println("Tên bệnh nhân ");
        String name = scanner.nextLine();
        System.out.println("Ngày nhập viện: ");
        String dayIn = RegexHost.inputDay();
        System.out.println("Ngày ra viện: ");
        String dayOut = RegexHost.inputDay();
        System.out.println("Lý do: ");
        String reason= scanner.nextLine();
        System.out.println("Loại VIP: ");
        String type = VipType.vipType();
        System.out.println("Thời gian VIP");
        String duration = RegexHost.inputDay();
        List<FileHospital> fileList = new ArrayList<>();
        fileList.add(new VipFile(id, codeFile, name, dayIn, dayOut, reason, type,duration));
        ReadAndWriteFileHospital.writeList(fileList, PATH_FILE_HOSPITAL, true);
        System.out.println("Thêm mới thành công");
    }
}
