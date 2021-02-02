package OOP_Basic;
/*
 1. static member field ( 객체간 공유자원 )
 
 2. static method : 자주 쓰이니까(많이) >> 편하게 사용하게 >> 객체를 생성하지 않고 사용할수있도록. >> static 
     why? : Math.random() >> Math m = new Math(); m.random() 이렇게 하지 않았을까?
     
 */
//import java.lang.*; default 

class StaticClass{
    int iv;
    
    static int cv;
    
    void m() {
        // 일반함수에서
        // cv 값을 가지고 놀수 있다?
        // 순서 ...
        // static 자원은 일반자원보다 항상 메모리에 먼저 올라간다.
        cv = 1000;
        // 순서상 m이라는 함수가 메모리에 올라가기전에 static 자원이 먼저 올라가기때문에.
        
    }
    
    static void sm() {
        // static 함수에서
        // 일반자원인 iv를 가지고 놀수 있다? ( x )
        // 순서상 static 이 먼저 만들어지기 때문에 
        // iv = 100;  생성시점때문에.
        // error 가 없게 할려면 ( static 은 static 끼리 놀아라)
        cv = 2222;
        
    }
}
public class Ex09_Static_Method {
    public static void main(String[] args) {
        
       System.out.println(StaticClass.cv);
       StaticClass.sm();
       System.out.println(StaticClass.cv);
       
       // 일반자원은 객체를 생성해야함.
       StaticClass sc = new StaticClass();
       sc.m();
       sc.sm();
       System.out.println(sc.iv);
       System.out.println(sc.cv);
       
    }
}
