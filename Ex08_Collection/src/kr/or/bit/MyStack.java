package kr.or.bit;

// Stack 자료 구조 설계
// 저장 공간 : Array : Object[] sarray
// Mystack my = new Mystack(); // 기본적으로 배열 생성 // 크기 설정 가능
// 위치정보 : 저장되는 값이 있는 위치정보(position, index)
// 기능 : push(Object), Object pop(), isEmpty(), Full()

public class MyStack {
    private Object[] arr;  // 저장공간
    private int count;  // 배열의 index (위치정보)
    private int maxsize;
    public MyStack(int maxsize) {
        this.maxsize = maxsize;
        this.arr = new Object[maxsize];
        count= -1;
    }
    
    public void push(Object value) {
        if(isFull()) {
            System.out.println("stack full....");
        }else {
            this.arr[++count] = value;  // -1 >> 0
        }
    }
    
    public Object pop() {
        Object value = null;
        
        if(isEmpty()) {
            System.out.println("Stack empty");
        }else {
            value = arr[count];
            count--; 
        }
        return value;

    }
    
    public boolean isEmpty() {
        return (count == -1); // true, false
    }
    public boolean isFull() {
        return (count == maxsize-1);
    }
}
