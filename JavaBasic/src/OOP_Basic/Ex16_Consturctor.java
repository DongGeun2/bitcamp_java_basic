package OOP_Basic;
/*
 생성자 함수(constructor)
 1. 함수 ( 특수한 목적 )
 2. 특수한 목적 ( member field 초기화 )
 
 Tip) {초기자 함수},  static{ static 초기자 함수 } 
 
 3. 일반함수 다른점 ( public void method m(), public String m(String s).... )
  3.1 함수의 이름이 고정(class 이름과 동일)
  3.2 실행시점 : 객체가 생성(new)가 발생하면 heap 공간이 할당되고 변수(member field)가 올라가고 생성자 함수 자동 호출
  3.3 실행시점 : return type이 없다. 생성자 함수는 무조건 void >> public [void] 클래스 이름. ( 어차피 void 이기 때문에 생략 )
                >> public 클래스 이름
 4. 목적 : 생성되는 객체마다 [강제적으로] member field 값을 초기화 할수 있다.
 
 class Car{
     String color;
 }
 -- 자동차를 만들면 무조건 색상 하나를 가져야 한다.
 Car car = new Car();
 -- 자동차는 각각 다른 색상을 가질 수 있다.
 class Car{
     public Car(String color){
         
     }
 }
 Car car = new Car(); 왜 () 를 붙일까 ?
                         ()는 함수를 호출.
 
 5. 생성자 함수 (method overloading) 
 
 6. 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면
 --default 생성자 함수는 반드시 구현을 통해서만 사용 가능하다.
 
 
 */

// 당신이 만약 자동차를 만든다면 반드시 자동차의 이름을 부여하세요.
class Car{
    String carname="포니";
    // 보이지 않지만 default로 생성자 함수가 생략.
    // 직접적으로 명시하지 않으면 컴파일러가 알아서 생성해줌.
    // public Car() {}
    public Car() {
        System.out.println("나 생성자야");   // 이건 강제 구현을 한다는 의미.
    }
}

class Car2{
    String carname;
    public Car2() {  // parameter가 없는 생성자를 default constructor
        carname = "포니";  // 초기화
    }
}

class Car3{
    String carname;
    public Car3() {
        carname="포니";
    }
    public Car3(String name) {    // overloading
        carname=name;
    }
}
class Car4{
    String carname;
    //default 를 구현하지 않음.
    //[예외적으로 overloading] 생성자를 구현했다면 default 는 자동으로 생성되지 않는다.
    //설계자의 의도 : 강제적 구현을 목적.
    public Car4(String name) {
        carname = name;
    }
}

public class Ex16_Consturctor {

    public static void main(String[] args) {
        Car car = new Car(); // * ()는 생성자 함수를 호출하는 ()였고 parameter를 받을수 있다.
        
        Car3 car3 = new Car3(); // default constructor 자동 호출
        System.out.println(car3.carname);
        
        Car3 car4 = new Car3("지네시스"); // overloading constructor
        System.out.println(car4.carname);
        
        Car4 car5 = new Car4("포드");
        System.out.println(car5.carname);

        Car4 car6 = new Car4("벤트");
        System.out.println(car6.carname);
        
    }

}
