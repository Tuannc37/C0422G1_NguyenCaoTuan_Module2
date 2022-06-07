package ss2_vonglap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhLaiNganHang {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi ");
        money = input.nextDouble();

        System.out.println("Nhập vào số tháng gửi ");
        money = input.nextInt();

        System.out.println("Nhập vào tỉ lệ lãi suất theo tháng ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("tổng số tiền thu được là :" + totalInterest);
    }
}
