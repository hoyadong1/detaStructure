package javaBasic;

import java.util.HashMap;
import java.util.Scanner;

public class MonthSchedule {


    public static void main(String[] args) {
        HashMap<Integer, Day> days = new HashMap<Integer, Day>();
        Scanner scan = new Scanner(System.in);

        for (int k = 1; k < 31; k++) {
            days.put(k, new Day());
        }
        System.out.println("�̹��� ������ ���� ���α׷�");
        while (true) {
            System.out.printf("����(�Է�:1, ����:2, ������:3 >>)");
            int i = scan.nextInt();
            if (i == 3) {
                System.out.printf("���α׷��� �����մϴ�.");
                break;
            }
            if (i == 1) {
                System.out.printf("��¥(1~30)? ");
                int date = scan.nextInt();
                System.out.printf("����(��ĭ�����Է�)? ");
                Day day = new Day();
                day.set(scan.next());
                days.put(date, day);
            }
            if (i == 2) {
                System.out.printf("��¥(1~30)? ");
                int date = scan.nextInt();
                System.out.printf("%d�Ͽ� ������ ", date);
                days.get(date).show();
            }
        }
    }

}
