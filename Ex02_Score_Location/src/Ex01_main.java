import kr.or.bit.common.Car;

/*
 클래스 == 설계도 == 데이터 타입(사용자 정의)
 
 클래스 구성 요소 : [필드(속성) + 함수(기능)] + 생성자 함수
 * field >> 고유 데이터, 상태 데이터, 부품(참조)정보 >> 변수
 * function >> 기능과 행위를 정의 >> 최소 단위(1개의 기능) ex) 밥을 먹는다. 잠을 잔다.
 * 추가적으로 생성자 함수(목적이 명확한) >> member field 초기화 목적
 
 클래스, 필드, 생성자, 함수 : 어느 곳에 위치하느냐 (scope) 이라고함. 영역 >> 접근자, 한정자, 수정자
 
 >> public, private, default, protected(상속)
 
  1. public class Car{}  >> kr.or.bit.common 폴더 아래위치.
     >> public 어느 폴더에 있든 사용가능
  2. class Airplane{} >> default 생략 >> 컴파일러가 자동으로 default가 있는 것 처럼 관리
     >> default (같은 폴더에서만 사용가능)
     >> default 접근자는 [같은 폴더 접근 가능][다른 폴더에 있으면 서로 접근 불가]
     >> default 접근자 같은 폴더(package) 연습 목적 . 현업에선 거의 사용 안함
     >> program 같은 package 안에 있는 클래스는 사용 가능
  3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다.   
  Ex01_main.java >> 여러개의 클래스 >> 단, Ex01_main 클래스만 public 을 갖는다. >> 나머지는 전부 defalut
  주로 연습할때 사용   
     
 */
class Test{ // default class Test
    int data; // 접근 제한자 : default
    
}

class Test2{ // default class Test
    int data2;
    public int data3; // 문법적으로는 오류 없지만 default 접근자 안에서 public을 사용한거이기에 효력 x 
    private int data4; // private는 setter, getter를 사용하여 연습할 경우 사용.
    void setData4(int d) {
        data4 = d;
    }
    int getData4() {
        return data4;
    }
}
public class Ex01_main {
    public static void main(String[] args) {
        Car car = new Car();
        
        
        // Airplane air = new Airplane();
        Test test = new Test();
        test.data = 100;
        System.out.println(test.data);
        
        Test2 test2 = new Test2();
        test2.data2 = 1;
        test2.data3 = 2;
        
    }

}
