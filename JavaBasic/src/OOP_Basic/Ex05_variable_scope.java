package OOP_Basic;
/*
 class 내부에 위치 : instance variable ( member field )  ( default 값이 있다 )
 method 내부에 위치 : local variable ( default 값이 없다. 반드시 초기화 사용 )
 
 ex) main(String[] args)   >> 함수 >> 안에 모든변수는 사용시 초기화 해야함.
 static variable >> 공유자원 ( 객체간 공유자원) >> * 객체 생성 이전에 memory에 올라가는 자원
                                             (class area 또는 method area) 라고 부른다.
 
 
 
 
 javac Ex05_variable_scope.java (컴파일)
 java Ex05_variable_scope       (실행)
 
 Ex05_variable_scope 정보 >> method(class) area
 그때 클래스 안에 static 자원이 있다면 그 자원을 바로 memory에 road 시킴.
 
 */

// 함수이름이 main 이면서 static 이면 class를 굳이 객체로 생성하지않아도 
// 메모리에 자동으로 올라간다.


class variable{
    int iv;   // member field, instance variable
    
    void method() {
        int lv = 0;   // local variable (지역변수) * 반드시 초기화해야함.
        
        // for(int i = 0 .... // i라는 변수는 block variable // for안에서만 유효
    }
    
    static int cv;
    // 1. class variable (클래스 변수), static variable(객체간 공유자원)
    // 2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
    // heap 이라는 영역에 생성된 [객체]들의 [공유자원]
    // 3. 특징 : 접근방법
    //  3.1 class 이름.static 변수명   >> variable.cv >> why? (객체가 생선되기 전에 접근 가능)
    //  3.2 variable v = new variable(); v.cv
    //      variable v2 = new variable(); v2.cv
    //      v.cv == v2.cv 같은 주소의 메모리
    // 4. 생선시점 : Hello.java > javac Hello.java > Hello.class
    //    > java.exe Hello 엔터 실행...
    //    > class loader System 에 의해서
    //    클래스를 정보(metadata : 설명) class area(method area) 올려요
    //    -- 이 클래스 언제 만들었고 어떤 자원을 import 하고 있고 변수 몇개... 기술...
    //    -- 이 클래스 안에 static variable 또는 static method 있으면
    //    -- 이 녀석을 memory ( classs area) 에 올려 놓는다.
    
    // * 클래스가 로딩될 떄 생성되고 프로그램이 종료될 때 소멸 (성능에 대한 문제.)
}

public class Ex05_variable_scope {
    
    public static void main(String[] args) {
        variable v = new variable();
        variable v2 = new variable();
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
        variable.cv = 200;   // 객체 간 공유자원 이기때문에 같은 주소값을 바라 본다.
        System.out.println(v.cv);
        System.out.println(v2.cv);
    }

}
