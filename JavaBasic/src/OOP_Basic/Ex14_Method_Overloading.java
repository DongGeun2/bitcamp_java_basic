package OOP_Basic;
/*
 OOP ( 객체 지향 프로그래밍 ) >> 설계도 만들기
 1. 상속 ( 재사용성 )
 2. 캡슐화 ( 은닉화 ) : private ( 직접할당, 간접할당 ) >> getter, setter
 3. 다형성 : 하나의 타입으로 여러개의 객체주소를 가지는 것.
 
 >> method overloading
 >> 하나의 이름으로 여러가지 기능을 하는 함수.
 대표적으로 System.out.println()  >> println() 이름은 1개 기능은 여러개
 1. 성능향상 (x)
 2. 설계자가 개발자의 편리성을 위해서 제공 ( 편하게 써 )
 
 문법 ) * 함수의 이름은 같고 parameter [개수] 와 [타입]을 다르게 만들면 overloading 으로 인정.
 1. 함수의 이름은 같아야 한다.
 2. parameter 개수 또는 타입은 달라야 한다.
 3. return type은 오버로딩의 판단 기준이 아니다.
 4. parameter 순서가 다름을 인정한다. ( 주의 )
 
 class out{
     public void println(){}
     public void println(int i){}
     public void println(String s){}
 }
 
   */

class Human2{
    String name;
    int age;
}

class OverTest{
    int add(int i) {
        return 100+i;
    }
    
    // 오버로딩
    int add(int i, int j) {
        return i+j;
    }
    
    //String add(int j) {    충돌 ( x )
    //    return "";
    //}
    
    String add(String s) {
        return "hello" + s;
    }
    
    // 순서가 다름을 인정한다. 
    // 1.
    String add(String s, int i) { // 인정
        return null;
    }
    // 2.
    String add(int i, String s) { // 인정
        return null;
    }
    
    
    void add(Human2 human) { // 인정
        human.name = "홍길동";
        human.age = 100;
        System.out.println(human.name + " , " + human.age);
                
    }
}




public class Ex14_Method_Overloading {
    
    public static void main(String[] args) {
        OverTest ot = new OverTest();
        ot.add(100);
        ot.add(new Human2());
        
        String result = ot.add("방가방가");
        System.out.println(result);
    }
}



