package javaBasic;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 입력하세요(예: Korea 5000)");
        Map<String, Integer> list = new HashMap<String, Integer>();

        while (true) {
            System.out.print("나라 이름, 인구 >>");
            String contry = scan.next();
            if (contry.equals("그만"))
                break;
            int population = scan.nextInt();

            list.put(contry, population);
        }

        while (true) {
            System.out.print("인구 검색>> ");
            String contry = scan.next();
            if (contry.equals("그만"))
                break;

            if (list.get(contry) == null) {
                System.out.printf("%s 나라는 없습니다.\n", contry);
                continue;
            }
            System.out.printf("%s의 인구는 %d\n", contry, list.get(contry));
        }

    }

}
