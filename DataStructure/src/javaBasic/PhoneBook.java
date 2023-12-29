package javaBasic;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("인원수>> ");
        int numberOfPeople = scan.nextInt();
        Phone list[] = new Phone[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            list[i] = new Phone();
            list[i].read(scan);
        }
        System.out.printf("저장되었습니다.\n");
        
        while (true) {
            System.out.printf("검색할 이름>> ");
            String name = scan.next();
            if(name.equals("그만")) break;
            
            Phone findPhone = null;
            
            for (int i = 0; i < numberOfPeople; i++) {
                if(list[i].name.equals(name)) {
                    findPhone = list[i];
                    break;
                }
            }
            
            if(findPhone == null) {
                System.out.printf("%s 이 없습니다.\n",name);
                continue;
            }
            System.out.printf("%s의 전화번호는 %s 입니다.\n",name,findPhone.number);
        }

    }
}
