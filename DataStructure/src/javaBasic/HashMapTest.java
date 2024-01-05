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
            System.out.print("이름과 학점 >> ");
            String name = scan.next();
            if (name.equals("그만"))
                break;
            Double grades = scan.nextDouble();

            list.put(name, grades);
        }
        System.out.print("장학생 선발 학점 기준 입력 >> ");
        Double socre = scan.nextDouble();
        System.out.print("장학생 명단 : ");
        for(Entry<String, Double> s : list.entrySet()) {
            if(s.getValue() > socre) System.out.print(s.getKey()+" ");
        }
    }

}
