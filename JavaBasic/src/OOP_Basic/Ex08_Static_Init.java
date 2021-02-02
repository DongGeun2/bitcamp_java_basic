package OOP_Basic;
// static 변수를 썼다는 의미는 모든 객체가 [같은 값]을 가지게 할거다 라는 의미이다.
// instance 변수를 썼다는 의미는 모든 객체가 [다른 값]을 가지게 할거다 라는 의미이다.

class InitTest{
    static int cv = 10;
    static int cv2;
    int iv = 11;
    
    static { // static 블럭 ( static 초기자 설정 블럭 )
        // static 초기자는 static 맴버필드에 초기값을 주는것을 목적으로 한다.
        cv = 10;   // member field 에서 초기화를 하나, 여기서 초기화를 하나 같은값이 아닐까 ??
        cv2 = cv+222; // static 초기자는 변형된(조작된) 값을 제공해줌.
    }
    
    {   // instance variable 초기화 블럭
        // new를 통해서 객체가 생성되고 int iv 변수가 메모리에 올라가고 나서 바로 호출 >> {  }
        System.out.println("초기자 블럭");
        if(iv > 10) iv = 100;
    }
    
    
    
    
}


public class Ex08_Static_Init {

    public static void main(String[] args) {
        System.out.println(InitTest.cv);
        System.out.println(InitTest.cv2);
        
        // 일반자원
        InitTest initTest = new InitTest();
        System.out.println(initTest.iv);
        }

}
