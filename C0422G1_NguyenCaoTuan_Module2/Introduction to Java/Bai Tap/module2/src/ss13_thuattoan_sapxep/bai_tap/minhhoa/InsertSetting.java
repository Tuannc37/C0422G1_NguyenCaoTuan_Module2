package ss13_thuattoan_sapxep.bai_tap.minhhoa;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng:");
        int size1 = scanner.nextInt();
        int[] array = new int[size1];
        inputArray(array);
        System.out.println("Mảng trước khi sắp xếp: ");
        outputArray(array);
        insertionSort(array);
        System.out.println("\nMảng sau khi sắp xếp: ");
        outputArray(array);
    }

    public static void inputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào a[" + i +"] = ");
            array[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int post = i;
            while (0 < post && x < arr[post - 1]) {
                arr[post] = arr[post - 1];
                post--;
            }
            arr[post] = x;
        }
    }

}
