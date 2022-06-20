package ss10_stack_queue.bai_tap.chuyendoi;
import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.print("Nhập vào số thập phân: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0)
        {
            int x = num % 2;
            stack.push(x);
            num /= 2;
        }
        System.out.print("Giá trị nhị phân là: ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
    }
}
