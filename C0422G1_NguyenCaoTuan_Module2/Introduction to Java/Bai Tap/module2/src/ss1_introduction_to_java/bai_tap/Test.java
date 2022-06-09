package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;

public class Test {
    static String pronounceZeroToTen(int number) {
        String str = "";
        switch (number) {
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
        }
        return str;
    }

    static String Pronounce11To19(int number) {
        String str = "";
        switch (number) {
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 14:
                str = "fourteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 16:
                str = "sixteen";
                break;
            case 17:
                str = "seventeen";
                break;
            case 18:
                str = "eighteen";
                break;
            case 19:
                str = "nineteen";
                break;
        }
        return str;
    }

    static String PronounceTens(int number) {
        String str = "";
        switch (number / 10) {
            case 2:
                str = "twenty";
                break;
            case 3:
                str = "thirty";
                break;
            case 4:
                str = "forty";
                break;
            case 5:
                str = "fifty";
                break;
            case 6:
                str = "sixty";
                break;
            case 7:
                str = "seventy";
                break;
            case 8:
                str = "eighty";
                break;
            case 9:
                str = "ninety";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number from 0 to 999");
            number = scanner.nextInt();
            if (number<0 || number>999){
                System.out.println("Just enter number from 0 to 999");
            }
        }while (number<0 || number>999);
        String answer;
        if (number <= 10) {
            System.out.println(pronounceZeroToTen(number));
        } else if (number < 20) {
            System.out.println(Pronounce11To19(number));
        } else if (number < 100) {
            answer = PronounceTens(number) + " " + pronounceZeroToTen(number % 10);
            System.out.println(answer);
        } else {
            if (number % 100 > 19) {
                answer = pronounceZeroToTen(number / 100) + " hundred and " + PronounceTens(number % 100) + " " + pronounceZeroToTen(number % 10);
            } else if (number % 100 > 10) {
                answer = pronounceZeroToTen(number / 100) + " hundred and " + Pronounce11To19(number % 100);
            } else {
                answer = pronounceZeroToTen(number / 100) + " hundred and " + pronounceZeroToTen(number % 10);
            }
            System.out.println(answer);
        }
    }
}

