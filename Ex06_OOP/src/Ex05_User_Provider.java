/*
 User 사용자 : Provider 제공자
 
 class A{}
 class B{}
 
 관계) A는 B를 사용한다.
 
 사용방법
 1. 상속 A extends B
 2. 포함 A 라는 클래스는 B를 member field 로 가질 수 있다  class A{B b;}
  2.1  부분집합
  2.2  전체집합
 ---------------------------------------------------------------
 // 차와 엔진의 관계
 class B{}
 class A{
     int i;
     B b; // A는 B를 사용합니다(포함)
     A(){
         b = new B();
     }
 }
 >> B라는 클래스는 독자적인 생성을 하지 않는다 >> A라는 객체가 만들어 져야 B도 생성
 >> A a = new A() >> A객체도 생성되고, B객체도 생성
 >> 같은 생명(생명주기가 같다)    >>    ** 전체집합 **
 ----------------------------------------------------------------
 // 학생과 학교의 관계
 class B{}
 class A{
     int i;
     B b; // A는 B를 사용합니다(포함)
     A(){

     }
     A(B b){
     this.b = b;
     }
 }
 
 
 >> void main()
     A a = new A();
     B b = new B();
     A a2 = new A(b);            >>  ** 부분집합 **
     
     // A, B 같은 운명체가 아니다
--------------------------------------------------------------------     
// Dependency (의존)
class B{}
class A{
     int i; 
     A(){
     }
     
     void m(B b){      //  ** A는 B에 의존합니다(함수) , B타입의 member field 가 없다
         b 객체를 가지고 작업
     }
 }

 >> void main()
 B b = new B();
 A a = new A();
 어떤 상황에는 B객체가 필요
 a.m(b);
 
      
 */
class B{
    
}
class A{
    void method(B b) {
        
    }
}

// ***
// 현대적인 프로그래밍 기법 : 인터페이스 활용
interface Icallable{
    void m();
}

class D implements Icallable{
    @Override
    public void m() {
        System.out.println("D Icallable 인터페이스에 m을 재정의");
    }   
}

class F implements Icallable{
    @Override
    public void m() {
        System.out.println("F Icallable 인터페이스에 m을 재정의");
    }    
}

//interface POINT >> 얼마나 유연하고, 확장성이 있게 만드냐...
class User{
 void method(Icallable ic) {
     ic.m();
     }
}

public class Ex05_User_Provider {

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.method(b); // B 타입의 객체 주소 // B 객체를 생성하지 않으면 method 함수는 사용 불가.
        
        D d = new D();
        F f = new F();
        User user = new User();
        user.method(d);
        user.method(f);

    }

}
