package javaBasic;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("이름 나이 도시 체중 독신 여부 공백 구분 입력");
        
        String name = scan.next();
        int age = scan.nextInt();
        String city = scan.next();
        double weight = scan.nextDouble();
        boolean single = scan.nextBoolean();
        
        System.out.printf("%s %d %s %f "+single,name,age,city,weight);

    }

}
