package javaBasic;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("�̸� ���� ���� ü�� ���� ���� ���� ���� �Է�");
        
        String name = scan.next();
        int age = scan.nextInt();
        String city = scan.next();
        double weight = scan.nextDouble();
        boolean single = scan.nextBoolean();
        
        System.out.printf("%s %d %s %f "+single,name,age,city,weight);

    }

}
