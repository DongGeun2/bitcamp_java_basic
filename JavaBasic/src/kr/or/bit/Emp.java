package kr.or.bit;

// class == 설계도 == Type(사용자 정의 타입)

// 사원이라는 설계도
// 사원을 표현 (사번, 이름, 직종, ......)
public class Emp {
    
    // 정보를 담을 수 있는 변수
    // 사원은 사번을 가지고 있다 (사번 숫자)
    // 변수 > 정보 (고유, 상태, 부품) 담을 수 있는 공간의 이름 >> instance variable >> member field
    // 변수의 종류(scope : 유효범위) : 선언되는 위치 
    // 1.   local variable (지역변수 : 함수) class Person{ public void run(){ int speed; }} // * 사용할려면 초기화 해야한다.
    // 1.1  함수안에 if블럭, for블럭안에 변수 (block variable)
    // 2.   instance variable(객체변수) class Person{ public int age; }
    // 3.   static variable : 공유자원(객체간)
    
    
    // 클래스의 종류
    // 1. class Test{ } >> 독자적인 실행이 불가능 >> 다른 클래스 도와주는 클래스(타입) >> lib
    // 2. class Test{public static void main(String[] args){}} >> 독자적인 실행이 가능한 클래스
    // 2.1 >> 함수의 이름(main) >> 약속 >> 시작점(진입점)
    // Tip) C# >> Main()
    
    // private 캡슐화 : 자원을 보호 하겠다
    // 직접할당을 막고 간접할당을 통해서 데이터 제어
    
    // void : 돌려주는게 없다
    
    private int empno;
    private String ename;
    private String job;
    
    
   
    public String getEname() { // getter 함수 (읽어오기)
        return ename + "님";
    }
    public void setEname(String ename) { // setter 함수 (쓰기)
        this.ename = ename;
    }






    private int num;
    // 함수 (최소의 기능 (행위) 단위)
    // 간접(누군가를 통해서 전달, 누군가를 통해서 받겠다)
    public void setNum(int n) { // setter 기능함수(write 함수)
        if(n > 0) {
            num = n;
        }else {
            num = 0;
        }
        
    }
    public int getNum() { // getter 기능함수(read 함수)
        return num;
    }
    
    
    
    
    
    
    public int number;
    
    public void print() {
        int number;
    }
}
