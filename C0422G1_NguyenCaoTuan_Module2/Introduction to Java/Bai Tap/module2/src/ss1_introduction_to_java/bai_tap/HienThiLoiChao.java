package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {

    public static void main(String[] args) {

    }
    public boolean beautifulArray(int[] arr) {
        int sum = 0, a = 0, b = 0;
        if (arr.length < 3) {
            return false;
        }
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int j=0; j < arr.length-1; j++) {
            a += arr[j];
            b = sum - a - arr[j+1];
            if (a == b) {
                return true;
            }
        }
        return false;
    }
}