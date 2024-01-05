package javaBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Double> list = new HashMap<String, Double>();

        while (true) {
            System.out.print("�̸��� ���� >> ");
            String name = scan.next();
            if (name.equals("�׸�"))
                break;
            Double grades = scan.nextDouble();

            list.put(name, grades);
        }
        System.out.print("���л� ���� ���� ���� �Է� >> ");
        Double socre = scan.nextDouble();
        System.out.print("���л� ��� : ");
        for(Entry<String, Double> s : list.entrySet()) {
            if(s.getValue() > socre) System.out.print(s.getKey()+" ");
        }
    }

}
