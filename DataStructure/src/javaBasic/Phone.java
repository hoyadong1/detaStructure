package javaBasic;

import java.util.Scanner;

public class Phone {
    String name;
    String number;

    public void read(Scanner scan) {
        System.out.print("�̸��� ��ȭ��ȣ �Է� >> ");
        name = scan.next();
        number = scan.next();
    }
}
