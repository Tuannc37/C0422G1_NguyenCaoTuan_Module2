package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;
public class DocSo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số");
        int number = scanner.nextInt();
        String readNumber = " ";
        String readNumber_a = " ";
        String readNumber_b = " ";
        String readNumber_c = " ";
        if(number >= 0 && number < 10){
            switch (number){
                case 1:
                    readNumber = "one";
                    break;
                case 2:
                    readNumber = "two";
                    break;
                case 3:
                    readNumber = "three";
                    break;
                case 4:
                    readNumber = "four";
                    break;
                case 5:
                    readNumber = "five";
                    break;
                case 6:
                    readNumber = "six";
                    break;
                case 7:
                    readNumber = "seven";
                    break;
                case 8:
                    readNumber = "eight";
                    break;
                case 9:
                    readNumber = "nine";
                    break;
            }
        }
        else if(number < 20){
            int b = number % 10;
            switch (b){
                case 1:
                    readNumber = "eleven";
                    break;
                case 2:
                    readNumber = "twelve";
                    break;
                case 3:
                    readNumber = "thirteen";
                    break;
                case 4:
                    readNumber = "fourteen";
                    break;
                case 5:
                    readNumber = "fifteen";
                    break;
                case 6:
                    readNumber = "sixteen";
                    break;
                case 7:
                    readNumber = "seventeen";
                    break;
                case 8:
                    readNumber = "eighteen";
                    break;
                case 9:
                    readNumber = "nineteen";
                    break;

            }
        }
        else if(number < 100){
            int a = number / 10;
            int b = number % 10;
            switch (a){
                case 2:
                    readNumber_a = "twenty";
                    break;
                case 3:
                    readNumber_a = "thirty";
                    break;
                case 4:
                    readNumber_a = "forty";
                    break;
                case 5:
                    readNumber_a = "fifty";
                    break;
                case 6:
                    readNumber_a = "fifteen";
                    break;
                case 7:
                    readNumber_a = "sixty";
                    break;
                case 8:
                    readNumber_a = "eighty";
                    break;
                case 9:
                    readNumber_a = "ninety";
                    break;
            }
            switch (b){
                case 1:
                    readNumber_b = "one";
                    break;
                case 2:
                    readNumber_b = "two";
                    break;
                case 3:
                    readNumber_b = "three";
                    break;
                case 4:
                    readNumber_b = "four";
                    break;
                case 5:
                    readNumber_b = "five";
                    break;
                case 6:
                    readNumber_b = "six";
                    break;
                case 7:
                    readNumber_b = "seven";
                    break;
                case 8:
                    readNumber_b = "eight";
                    break;
                case 9:
                    readNumber_b = "nine";
                    break;

            }
            readNumber = readNumber_a + " " + readNumber_b;
        }
        else if(number < 10000){
            int a = number / 100;
            int b = (number / 10) % 10;
            int c = number % 10;

            switch (a){
                case 1:
                    readNumber_a = "one";
                    break;
                case 2:
                    readNumber_a = "two";
                    break;
                case 3:
                    readNumber_a = "three";
                    break;
                case 4:
                    readNumber_a = "four";
                    break;
                case 5:
                    readNumber_a = "five";
                    break;
                case 6:
                    readNumber_a = "six";
                    break;
                case 7:
                    readNumber_a = "seven";
                    break;
                case 8:
                    readNumber_a = "eight";
                    break;
                case 9:
                    readNumber_a = "nine";
                    break;

            }
            switch (b){
                case 2:
                    readNumber_b = "twenty";
                    break;
                case 3:
                    readNumber_b = "thirty";
                    break;
                case 4:
                    readNumber_b = "forty";
                    break;
                case 5:
                    readNumber_b = "fifty";
                    break;
                case 6:
                    readNumber_b = "fifteen";
                    break;
                case 7:
                    readNumber_b = "sixty";
                    break;
                case 8:
                    readNumber_b = "eighty";
                    break;
                case 9:
                    readNumber_b = "ninety";
                    break;
            }
            switch (c){
                case 1:
                    readNumber_c = "one";
                    break;
                case 2:
                    readNumber_c = "two";
                    break;
                case 3:
                    readNumber_c = "three";
                    break;
                case 4:
                    readNumber_c = "four";
                    break;
                case 5:
                    readNumber_c = "five";
                    break;
                case 6:
                    readNumber_c = "six";
                    break;
                case 7:
                    readNumber_c = "seven";
                    break;
                case 8:
                    readNumber_c = "eight";
                    break;
                case 9:
                    readNumber_c = "nine";
                    break;

            }
            readNumber = readNumber_a + " hundred and " + readNumber_b + " " + readNumber_c;
        }

        System.out.printf("So vua nhap la %s :",readNumber);
    }
}

