package javaBasic;

import java.util.Vector;

interface IStack<T> {
    T pop();

    boolean push(T ob);
}


class MyStack<T> implements IStack<T> {
    int pointer;
    Vector<T> v;

    public MyStack() {
        this.pointer = 0;
        this.v = new Vector<T>();
    }


    @Override
    public T pop() {
        if(--pointer<0) return null;
        return v.get(pointer);
    }

    @Override
    public boolean push(T ob) {
        v.add(pointer++, ob);
        return true;
    }

}


public class StackManager {

    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i = 0; i < 10; i++)
            stack.push(i);
        while (true) {
            Integer n = stack.pop();
            if (n == null)
                break;
            System.out.print(n + " ");
        }
    }


}
