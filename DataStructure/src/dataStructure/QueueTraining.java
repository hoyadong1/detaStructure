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
        if(isFull()) return;
        c[tail] = e;
        tail= (tail+1)%20;
    }

    public char depueue() {
        if(isEmpty()) return 'N';
        char r = c[head];
        head = (head+1)%20;
        return r;
    }

    public boolean isEmpty() {
        return (tail == head);
    }
    public boolean isFull() {
        return head == ((tail+2)%20);
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
            stack.point = 0;
            queue.head = queue.tail;
        }

    }

}
