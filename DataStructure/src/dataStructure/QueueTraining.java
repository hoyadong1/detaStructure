package dataStructure;

import java.util.Scanner;

class Queue {
    char[] c;
    int head, tail;

    public Queue() {
        c = new char[20];
        head = 0;
        tail = 0;
    }

    public void enqueue(char e) {
        c[tail++] = e;
    }

    public char depueue() {
        return c[head++];
    }

    public boolean isEmpty() {
        return (tail == head);
    }

    public void reset() {
        head = 0;
        tail = 0;
    }
}


public class QueueTraining {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Input string>>");
            String s = scan.next();
            if(s.equals("exit")) break;

            for (char c : s.toCharArray()) {
                stack.push(c);
                queue.enqueue(c);
            }
            while (!queue.isEmpty() && (char) stack.pop() == queue.depueue()) {
            }
            if (queue.isEmpty()) {
                System.out.print(true);
            } else
                System.out.print(false);
            System.out.println();
            queue.reset();
        }

    }

}
