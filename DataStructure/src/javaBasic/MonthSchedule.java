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
        System.out.println("이번달 스케줄 관리 프로그램");
        while (true) {
            System.out.printf("할일(입력:1, 보기:2, 끝내기:3 >>)");
            int i = scan.nextInt();
            if (i == 3) {
                System.out.printf("프로그램을 종료합니다.");
                break;
            }
            if (i == 1) {
                System.out.printf("날짜(1~30)? ");
                int date = scan.nextInt();
                System.out.printf("할일(빈칸없이입력)? ");
                Day day = new Day();
                day.set(scan.next());
                days.put(date, day);
            }
            if (i == 2) {
                System.out.printf("날짜(1~30)? ");
                int date = scan.nextInt();
                System.out.printf("%d일에 할일은 ", date);
                days.get(date).show();
            }
        }
    }

}
