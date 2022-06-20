package ss10_stack_queue.bai_tap.dao;


import java.util.Scanner;
import java.util.Stack;

public class DaoChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String str = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder str1 = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str1.append(stack.pop());
        }
        System.out.println(str1.toString());
    }
}
