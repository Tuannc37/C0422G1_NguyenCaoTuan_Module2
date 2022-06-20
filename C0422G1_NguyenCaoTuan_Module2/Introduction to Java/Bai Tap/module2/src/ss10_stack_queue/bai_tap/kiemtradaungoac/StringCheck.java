package ss10_stack_queue.bai_tap.kiemtradaungoac;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StringCheck {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi cần kiểm tra");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(balancedParenthensies(str));

    }
    public static boolean balancedParenthensies(String str) {
        List<Character> leftKeys = Arrays.asList('(');
        List<Character> rightKeys = Arrays.asList(')');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (leftKeys.contains(c)) {
                stack.push(c);
            } else if (rightKeys.contains(c)) {
                int index = rightKeys.indexOf(c);
                if (stack.isEmpty() || stack.pop() != leftKeys.get(index)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
