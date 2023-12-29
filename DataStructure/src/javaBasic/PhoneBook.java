package javaBasic;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("�ο���>> ");
        int numberOfPeople = scan.nextInt();
        Phone list[] = new Phone[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            list[i] = new Phone();
            list[i].read(scan);
        }
        System.out.printf("����Ǿ����ϴ�.\n");
        
        while (true) {
            System.out.printf("�˻��� �̸�>> ");
            String name = scan.next();
            if(name.equals("�׸�")) break;
            
            Phone findPhone = null;
            
            for (int i = 0; i < numberOfPeople; i++) {
                if(list[i].name.equals(name)) {
                    findPhone = list[i];
                    break;
                }
            }
            
            if(findPhone == null) {
                System.out.printf("%s �� �����ϴ�.\n",name);
                continue;
            }
            System.out.printf("%s�� ��ȭ��ȣ�� %s �Դϴ�.\n",name,findPhone.number);
        }

    }
}
