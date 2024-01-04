package javaBasic;

import java.util.Scanner;

public class Phone {
    String name;
    String number;

    public void read(Scanner scan) {
        System.out.print("이름과 전화번호 입력 >> ");
        name = scan.next();
        number = scan.next();
    }
}
