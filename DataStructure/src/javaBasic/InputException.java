package javaBasic;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("���� 3���� �Է��ϼ���\n");
        int n = 0, sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
                scan.next();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("�� : " + sum);

    }

}
