package dataStructure;

import java.util.Scanner;

class Stack {
    int list[];
    int point;

    public Stack() {
        list = new int[10];
        point = 0;
    }

    public void push(int e) {
        list[point] = e;
        point++;
    }

    public int pop() {
        return list[--point];
    }

    public int peek() {
        return list[(point - 1)];
    }

    public boolean isEmpty() {
        return (point == 0);
    }
}


class FomulaConverter {
    Stack stack;
    String s;
    String fomula[];

    private static int getPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0; // 괄호나 다른 문자는 우선순위가 없음
        }
    }

    public FomulaConverter(int length) {
        stack = new Stack();
        fomula = new String[length];
    }

    public String[] convert(String s) {
        int i = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                fomula[i] = String.valueOf(c);
                i++;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    fomula[i] = String.valueOf((char) stack.pop());
                    i++;
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPriority((char) stack.peek()) >= getPriority(c)) {
                    fomula[i] = String.valueOf((char) stack.pop());
                    i++;
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty())
            fomula[i++] = String.valueOf((char) stack.pop());

        return fomula;
    }
}


public class StackTraining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = scan.next();
        String fomula[] = new FomulaConverter(s.length()).convert(s);

        for (String ss : fomula) {
            if (ss == null)
                break;
            System.out.print(ss + " ");
        }
        System.out.println();
        Stack stack = new Stack();

        int length = fomula.length;
        int temp = 0;

        for (int i = 0; i < length; i++) {
            if (fomula[i] == null)
                break;
            switch (fomula[i]) {
                case "+":
                    temp = stack.pop();
                    temp = temp + stack.pop();
                    stack.push(temp);
                    break;
                case "-":
                    temp = stack.pop();
                    temp = stack.pop() - temp;
                    stack.push(temp);
                    break;
                case "*":
                    temp = stack.pop();
                    temp = temp * stack.pop();
                    stack.push(temp);
                    break;
                case "/":
                    temp = stack.pop();
                    temp = stack.pop() / temp;
                    stack.push(temp);
                    break;
                default:
                    stack.push(Integer.parseInt(fomula[i]));
                    break;
            }
        }

        System.out.println("Answer: " + stack.pop());
    }
}
