package javaBasic;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("정수 3개를 입력하세요\n");
        int n = 0, sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                scan.next();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합 : " + sum);

    }

}
