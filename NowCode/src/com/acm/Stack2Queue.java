package com.acm;

import java.util.Stack;

/**
 * Created by Han on 2017/09/10.
 */
public class Stack2Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() {

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        int pop=stack1.pop();
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return pop;
    }

    @Override
    public String toString() {

        StringBuffer str=new StringBuffer();
        for(int i=0;i<stack2.size();i++){
            str.append(stack2.get(i)+" ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Stack2Queue queue=new Stack2Queue();
        queue.push(1);
        queue.push(3);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.toString());
        System.out.println(queue.pop());
        System.out.println(queue.toString());
        System.out.println(queue.pop());
        System.out.println(queue.toString());
        queue.push(9);
        System.out.println(queue.toString());

    }
}
