package javaBasic;

import java.util.*;


public class VectorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int max = 0;

        System.out.print("정수(-1이 입력될 때까지)>> ");
        while (true) {
            int n = scan.nextInt();
            if (n == -1)
                break;
            max = (max < n ? n : max);
            v.add(n);
        }
        System.out.println("가장 큰 수는 "+max);
        v.stream().filter(value -> value>10).forEach(System.out ::print);
    }
}
