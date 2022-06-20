package ss10_stack_queue.bai_tap.dao;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;


public class DaoMang {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào a[" + i +"] = ");
            array[i] = scanner.nextInt();
            list.add( array[i]);
        }
        System.out.println("Mảng nhập vào: " + list);

        Stack<Integer> stack = new Stack<Integer>();
        while (list.size() > 0) {
            stack.push(list.remove(0));
        }
        while (stack.size() > 0) {
            list.add(stack.pop());
        }
        System.out.println("Mảng sau khi đảo: " + list);
    }

}

