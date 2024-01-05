package javaBasic;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }

}


class ColorTV extends TV {
    int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    void printPropoerty() {
        System.out.printf("%d인치 %d Color TV\n", super.getSize(), color);
    }

}


class IPTV extends ColorTV {
    String ip;

    public IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    @Override
    void printPropoerty() {
        System.out.printf("%s 주소의", ip);
        super.printPropoerty();
    }

}


public class Trainning3 {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("This");
        //
        // sb.append(" is pencil");
        // System.out.println(sb);
        //
        // sb.insert(7, " my");
        // System.out.println(sb);
        //
        // sb.replace(8,10,"your");
        // System.out.println(sb);
        //
        // sb.delete(8, 13);
        // System.out.println(sb);
        //
        // sb.setLength(4);
        // System.out.println(sb);

        // StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
        // while(st.hasMoreElements()) {
        // System.out.println(st.nextToken());
        // }
        // System.out.println(Math.PI);
        // System.out.println(Math.ceil(3.5));
        // System.out.println(Math.floor(3.5));
        // System.out.println(Math.sqrt(9));
        // System.out.println(Math.exp(2));
        // System.out.println(Math.round(3.14));
        //
        // System.out.println("이번주 행운의 번호는 ");
        // for(int i=0;i<5;i++) {
        // System.out.print((int)(Math.random()*45 + 1) + " ");
        // }

        // ArrayList<String> a = new ArrayList<String>();
        //
        // Scanner scan = new Scanner(System.in);
        // for (int i = 0; i < 4; i++) {
        // System.out.print("이름을 입력하세요>>");
        // String s = scan.next();
        // a.add(s);
        // }
        //
        // for (int i = 0; i < a.size(); i++) {
        // // ArrayList의 i 번째 문자열 얻어오기
        // String name = a.get(i);
        // System.out.print(name + " ");
        // }
        //
        // int longestIndex = 0;
        // for (int i = 1; i < a.size(); i++) {
        // if (a.get(longestIndex).length() < a.get(i).length())
        // longestIndex = i;
        // }
        // System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
        // try{
        // a.remove(6);
        // }
        // catch(IndexOutOfBoundsException e) {
        // System.out.println("인덱스 초과");
        // }

        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            String kor = dic.get(eng);
            if (kor == null)
                System.out.println(eng + "는 없는 단어 입니다.");
            else
                System.out.println(kor);
        }

    }



}
