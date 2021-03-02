/*
 추상클래스
 >> 미완성 클래스(완성되지 않은 설계도)
 1. 완성된 코드 + 미완성 코드
 2. 완성된 코드의 정의 : 함수를 기반으로 하고 실행 블럭이 있는 함수(독립적으로 실행 가능한 함수) void run(){}
    미완성 코드의 정의 : 함수를 기반인데 실행 블럭이 없는 함수(void run(); )
 3. 완성된 클래스(new 기능) 
    미완성 클래스(스스로 객체 생성 불가능)
 
 
 정리
 1. 추상클래스(미완성 클래스) : 스스로 객체 생성 불가(new 사용 불가)
 2. 추상클래스는 결국 완성된 클래스를 만드는 것이 목적 [상속을 통해서만 가능]
 3. 상속관계에서 미완성된 자원(추상함수) 구현해라 >> 재정의 해라. (override)
 
 설계자 입장에서
 >> 의도 : 상속하여 반드시 재정의 >> 강제적 구현
 

 */

class Car{
    void run() {  // 강제성이 없다.
        
    }
}

class Hcar extends Car{
    // Hcar run() 재정의 해도 되고, 안해도 문제 없다.
}

///////////////////////////////////////////////
abstract class Abclass{ // abstract : 클래스 안에 최소 1개의 추상자원을 만들겠다는 의미.
    // 완성된 코드
    int pos;
    void run() {
        ++pos;
    }
    // 미완성된 코드
    abstract void stop();   // { x } >> 추상 함수 >> 반드시 재정의하여 사용
}

class Child extends Abclass{
    @Override
    void stop() {  // 강제적 구현
        this.pos = 0;
        System.out.println("Stop :" + this.pos);
    }   
}

class Child2 extends Abclass{
    @Override
    void stop() {
        this.pos = -1;
        System.out.println("Stop :" + this.pos);     
    }  
}



public class Ex01_abstract_class {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
        ch.run();
        System.out.println(ch.pos);
        ch.stop();
        
        Child2 ch2 = new Child2();
        
        /////////////////////////////
        // 다형성의 개념이 숨어있다 //
        Abclass ab = ch;
        // 부모타입의 참조 변수는 자식타입 객체의 주소를 가질 수 있다 (다형성)
        // 단, 부모는 자기타입의 자원만 볼 수 있다.
        
        ab.run();
        System.out.println(ab.pos);
        ab.stop();  // 재정의
        // 부모 타입으로 접근하더라도 추상함수는 실행이 안된다. >> 그래서 자식이 가지고 있는 재정의 되어있는 함수를 예외적으론 호출 
        
        
        
    }

}
