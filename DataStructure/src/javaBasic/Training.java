package javaBasic;

import java.util.Scanner;

public class Training {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("�ݾ��� �Է��ϼ���");
         int price = scanner.nextInt();
        
         int oman = price/50000;
         int man = (price%50000)/10000;
         int chun = (price%10000)/1000;
         int back = (price%1000)/100;
         int oship = (price%100)/50;
         int ship = (price%50)/10;
         int ill = price%10;
        
         System.out.printf("%d %d %d %d %d %d %d",oman, man, chun, back, oship, ship, ill);


//        System.out.println("ù ��° ���簢���� ���� �ϴ� ��ǥ (xl1, yl1)�� ������ ��� ��ǥ (xr1, yr1)�� �Է��ϼ���:");
//        int xl1 = scanner.nextInt();
//        int yl1 = scanner.nextInt();
//        int xr1 = scanner.nextInt();
//        int yr1 = scanner.nextInt();
//
//
//        System.out.println("�� ��° ���簢���� ���� �ϴ� ��ǥ (xl2, yl2)�� ������ ��� ��ǥ (xr2, yr2)�� �Է��ϼ���:");
//        int xl2 = scanner.nextInt();
//        int yl2 = scanner.nextInt();
//        int xr2 = scanner.nextInt();
//        int yr2 = scanner.nextInt();
//
//
//        int overlapArea = calculateOverlapArea(xl1, yl1, xr1, yr1, xl2, yl2, xr2, yr2);
//
//
//        System.out.println("�� ���簢���� ��ġ�� ������ ���̴� " + overlapArea + "�Դϴ�.");
//
//
//    }
//
//    private static int calculateOverlapArea(int xl1, int yl1, int xr1, int yr1, int xl2, int yl2,
//            int xr2, int yr2) {
//        int overlapWidth = Math.max(0, Math.min(xr1, xr2) - Math.max(xl1, xl2));
//        int overlapHeight = Math.max(0, Math.min(yr1, yr2) - Math.max(yl1, yl2));
//
//        return overlapWidth * overlapHeight;
    }

}


