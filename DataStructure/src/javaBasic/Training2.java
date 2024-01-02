package javaBasic;

import java.util.Scanner;
import java.util.*;

public class Training2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오 >>");

        String a = scan.next();
        char alpha = a.charAt(0);

        int count = alpha - 97;
        char alphaA = 'a';

        for (int k = count; k >= 0; k--) {
            for (int j = 0; j <= k; j++) {
                System.out.printf("%c", alphaA + j);
            }
            System.out.println();
        }

        /////////////////////////////////////////////////////////////////////////

        System.out.print("배열의 크기를 입력하세요 (100보다 작은 수): ");
        int arraySize = scan.nextInt();

        while (arraySize >= 100) {
            System.out.print("100보다 작은 수를 입력하세요: ");
            arraySize = scan.nextInt();
        }


        Set<Integer> uniqueNumbers = new HashSet<>();


        Random random = new Random();
        while (uniqueNumbers.size() < arraySize) {
            int randomNumber = random.nextInt(100) + 1;
            uniqueNumbers.add(randomNumber);
        }


        Integer[] randomArray = uniqueNumbers.toArray(new Integer[0]);


        System.out.print("생성된 배열: ");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }



    }

}
