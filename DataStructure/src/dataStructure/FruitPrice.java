package dataStructure;
import java.util.Scanner;

public class FruitPrice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("���� ���� �帱���?");
        String name = scan.next();
        int price = 0;
        
        switch(name) {
            case "apple":
            case "banana":
                price = 500;
                break;
            case "orange":
                price = 1000;
                break;
            case "mango":
                price = 1500;
                break;
            default :
                System.out.println("���� �����Դϴ�");
        }
        
        if(price !=0)
            System.out.printf("%s�� ���� : %d\n",name,price);

    }

}
