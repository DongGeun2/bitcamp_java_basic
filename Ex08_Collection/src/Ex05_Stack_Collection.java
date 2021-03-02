import java.util.Stack;

import kr.or.bit.MyStack;

/*
 JAVA API 
 Stack Queue 제공
 
 
 Stack 자료 구조 그림그리고 암기 (응용)
 
*/


public class Ex05_Stack_Collection {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        System.out.println(s.pop());
        System.out.println(s.pop());
        // System.out.println(s.pop());  java.util.EmptyStackException
        System.out.println(s.isEmpty()); // true
        s.push("A");
        System.out.println(s.pop());
        
        
        MyStack my = new MyStack(5);
        System.out.println(my.isEmpty());
        System.out.println(my.isFull());
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
        //my.push("F");
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
    }

}
