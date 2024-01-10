package dataStructure;

import java.util.*;
import java.util.Map.Entry;

public class BasicTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("202015031");
        
        
        while (true) {
            Map<Integer,Integer> list = new HashMap<Integer,Integer>();
            System.out.print("ют╥б>> ");
            int num = scan.nextInt();
            if(num == 0) break;
            for(int i=0;i<num;i++) {
                list.put(i, 0);
            }
            for (int i = 0; i < num; i++) {
                int k = (int)(Math.random()*num);
                list.put(k,(list.get(k)+1));
                System.out.print(k + " ");
            }
            System.out.println();
            for(Entry<Integer, Integer> s : list.entrySet()) {
                System.out.print(s.getKey()+"("+s.getValue()+") ");
            }
            
        }
    }

}
