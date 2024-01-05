package javaBasic;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("���� �̸��� �α��� �Է��ϼ���(��: Korea 5000)");
        Map<String, Integer> list = new HashMap<String, Integer>();

        while (true) {
            System.out.print("���� �̸�, �α� >>");
            String contry = scan.next();
            if (contry.equals("�׸�"))
                break;
            int population = scan.nextInt();

            list.put(contry, population);
        }

        while (true) {
            System.out.print("�α� �˻�>> ");
            String contry = scan.next();
            if (contry.equals("�׸�"))
                break;

            if (list.get(contry) == null) {
                System.out.printf("%s ����� �����ϴ�.\n", contry);
                continue;
            }
            System.out.printf("%s�� �α��� %d\n", contry, list.get(contry));
        }

    }

}
