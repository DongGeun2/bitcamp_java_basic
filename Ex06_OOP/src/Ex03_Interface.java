/*
 추상클래스 : 인터페이스(Interface)
 
 인터페이스 : 표준, 약속, 규약, 규칙 을 만드는 행위
 
 [추상 클래스 : 인터페이스 공통점]
  1. 스스로 객체 생성 불가능( new 연산자를 통한 객체 생성 불가 )
   1.1 차이점 : 추상 클래스(완성 + 미완성), 인터페이스(모든 것이 미완성)
   
  2. 사용
  추상클래스 : extends
  인터페이스 : 구현해라 implements 
  class Car extends abClass{}
  class Car implements la{} // 인터페이스가 가지는 추상자원을 재정의 해라.
 
  추상클래스 인터페이스
  1. 다중 상속(구현) 가능 >> 약속(작은 단위로 여러개) >> 여러개의 작은 약속을 모아 모아서 큰 약속을 만든다.
  class Test extends Object implements Ia, Ib, Ic
  약속을 크게 만들면 >> 사용성이 떨어진다 >> 한정 >> 쪼개어서 ....
  
  2. 추상클래스는 단일원속원칙(계층적 상속)
  
  3. 추상클래스는 ( 완성 + 미완성 )
  
  4. 인터페이스는 (상수를 제외한 나머지는 미완성(추상)자원 >> JDK(Default 값, static 값)
  
  
  인터페이스 소프트웨어 설계 최상위 단계
  (경험과 노하우가 필요함)
  어떤 프로젝트 진행하게 되면 표준을 만드는데 그것이 정말 어렵다.
  
  ++개발자(초급)++
  1. 인터페이스 [다형성] 입장으로 접근 ( 인터페이스는 부모 타입 )
  2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능 ( 인터페이스를 구현함으로 써 같은 부모를 가지게 만든다 )
  3. JAVA API 여러 분이 사용할 만한 수많은 Interface 를 구현해둠. ( 가져다 쓰는 것만 해도 된다 )
  4. 인터페이스 (관용적) 표현 : (~able) ~ 할수있는 : 수리할 수 있는, 날 수 있는 : Cloneable ( 관용적인 표현 )
  5. 객체간 연결 고리(객체간 소통) >> 다형성을 통해(같은 부모로써)  
  
  
 */
/*
interface Iable{
    String print();
    // 출력할때 print 함수 사용해라. return 은 문자열
}

class Test implements Iable{
    
    @Override
    public String print() {
        return null;
    }
    
}
*/

// 설계에 대한 표준을 만드는 작업 >> 구현을 강제하는것 (재정의 하도록 강제)

/*
 1. 인터페이스는 실제 구현부를 가지고 있지 않다 : 실행블럭이 없는 함수 : void run();
  게임 설계 : move(int x, int y) >> 인터페이스 >> 탱크, 마린 >> move 강제 구현
 >> JAVA API : Collection (동적배열 : 자료구조) >> Vector, *[ArrayList], HashSet, *[HashMap]
 >> Vector, *[ArrayList], HashSet, *[HashMap] 이것들은 수많은 Interface 를 구현하고 있다.
 
 
 2. 생성방법 ( interface 자원 )
  2.1 public static final int VERSION = 1; >> int VERSION = 1 >> 컴파일러가 알아서 [public static final] 있다고 붙여줌.
  
  2.2 public abstract void run(); >>  [public abstract] 생략 가능 >> void run();
 
  interface Iable{
      [public static final] int VERSION = 1;
      [public abstract void] run();
  }
  
  실제 사용
    interface Iable{
      int VERSION = 1;
      void run();
      String move(int x, int y);
  }
  
  interface Iable{ }
  interface Bable{int NUM = 0; }
  interface Cable{void run(); void move(); }
  
  class Test extends Object implements Iabel, Bable, Cable
  
 */
interface Humanable{
    int AGE = 100;
    String GENDER = "남";
    
    String print();
    void message(String str);    
}

interface Iable{
    int AGE=10;
    void info();
    String val(String s);          
}

class Test extends Object implements Humanable, Iable{
    @Override
    public void info() {

        
    }
    @Override
    public String val(String s) {

        return null;
    }
    @Override
    public String print() {

        return null;
    }
    @Override
    public void message(String str) {

        
    }
    
}

public class Ex03_Interface {

    public static void main(String[] args) {
        Test t = new Test();
        Humanable h = t; // 다형성 ( 부모는 자식객체의 주소를 가질 수 있다 )
        System.out.println(h.AGE);
        
        Iable ia = t;
        System.out.println(ia.AGE);
        
        
        
    }

}
