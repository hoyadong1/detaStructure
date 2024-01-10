package dataStructure;

import java.util.Scanner;
import java.util.LinkedList;

class Node {
    int degree;
    int coeffi;

    public Node(int degree, int coeffi) {
        this.degree = degree;
        this.coeffi = coeffi;
    }
}


public class ListTraining {
    public static void main(String[] args) {
        LinkedList<Node> fList = new LinkedList<Node>();
        LinkedList<Node> sList = new LinkedList<Node>();
        LinkedList<Node> resultList = new LinkedList<Node>();

        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 다항식 입력>>");
        String first = scan.nextLine();
        System.out.print("두번째 다항식 입력>>");
        String second = scan.nextLine();

        String f[] = first.split(" ");
        String s[] = second.split(" ");

        int fLen = f.length;
        int sLen = s.length;
        int size = fLen > sLen ? fLen : sLen;



        for (int i = 0; i < fLen; i += 2) {
            fList.add(new Node(Integer.parseInt(f[i+1]), Integer.parseInt(f[i])));
        }
        for (int i = 0; i < sLen; i += 2) {
            sList.add(new Node(Integer.parseInt(s[i+1]), Integer.parseInt(s[i])));
        }

        int fp = 0, sp = 0;

        while (fp < (fLen / 2) && sp < (sLen / 2)) {
            if (fList.get(fp).degree > sList.get(sp).degree) {
                resultList.add(fList.get(fp));
                fp++;
            } else if (fList.get(fp).degree < sList.get(sp).degree) {
                resultList.add(sList.get(sp));
                sp++;
            } else {
                int coeffi = fList.get(fp).coeffi + sList.get(sp).coeffi;
                int degree = sList.get(sp).degree;

                resultList.add(new Node(degree, coeffi));
                sp++;
                fp++;
            }
        }
        
        for(;fp<(fLen / 2);fp++) {
            resultList.add(fList.get(fp));
        }
        for(;sp<(sLen / 2);sp++) {
            resultList.add(sList.get(sp));
        }
        
        System.out.print("다항식 덧셈 결과>>");
        for(Node n  : resultList) {
            System.out.printf("%d %d ",n.coeffi,n.degree);
        }

    }
}
