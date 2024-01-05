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
        System.out.printf("%d��ġ %d Color TV\n", super.getSize(), color);
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
        System.out.printf("%s �ּ���", ip);
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

        // StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
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
        // System.out.println("�̹��� ����� ��ȣ�� ");
        // for(int i=0;i<5;i++) {
        // System.out.print((int)(Math.random()*45 + 1) + " ");
        // }

        // ArrayList<String> a = new ArrayList<String>();
        //
        // Scanner scan = new Scanner(System.in);
        // for (int i = 0; i < 4; i++) {
        // System.out.print("�̸��� �Է��ϼ���>>");
        // String s = scan.next();
        // a.add(s);
        // }
        //
        // for (int i = 0; i < a.size(); i++) {
        // // ArrayList�� i ��° ���ڿ� ������
        // String name = a.get(i);
        // System.out.print(name + " ");
        // }
        //
        // int longestIndex = 0;
        // for (int i = 1; i < a.size(); i++) {
        // if (a.get(longestIndex).length() < a.get(i).length())
        // longestIndex = i;
        // }
        // System.out.println("\n���� �� �̸��� : " + a.get(longestIndex));
        // try{
        // a.remove(6);
        // }
        // catch(IndexOutOfBoundsException e) {
        // System.out.println("�ε��� �ʰ�");
        // }

        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "�Ʊ�");
        dic.put("love", "���");
        dic.put("apple", "���");


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("ã�� ���� �ܾ��?");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("�����մϴ�...");
                break;
            }
            String kor = dic.get(eng);
            if (kor == null)
                System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
            else
                System.out.println(kor);
        }

    }



}
