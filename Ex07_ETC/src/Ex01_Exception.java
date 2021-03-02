/*
 오류
 1. 에러(error)      : 네트워크 장애, 메모리이상, 하드웨어고장 >> 개발자가 코드적으로 해결 불가
 2. 예외(exception)  : 개발자의 코드 실수에 의해 발생 >> 방어적인 코드 ( 예외처리 )
 >> 예외가 발생하면 의도치 않게 프로그램은 강제 종료 된다. >> 비정상적인 종료
 
 try{
     >> 문제가 발송할 수 있는 코드
     >> 문제가 발생하면 catch
 }catch(Exception e){
     >> 문제가 생기면 catch를 통해서 문제를 파악
     >> 처리 유도
     >> 1. 관리자에게 email
     >> 2. 로그파일에 문제 기록
     >> 3. 강제 종료 막는다
     >>  개발자의 코드 수정이 필요하다.
 
 }finally{
     >> 문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
     >> DB 연결 해제
 
 }
 예외가 발생하면 개발자는 예외발생건에 대해서 파악(어떤 자원에서, 어떤 행위에서) 발생하였는지 파악 하고 싶은거임.
 예외에 관련된 클래스 설계 ..... 예외가 발생하면 자동으로 예외에 맞는 class를 객체에 생성
                            그리고 다양한 정보를 그 객체에 넣어준다.
 
 
 */
public class Ex01_Exception {
    public static void main(String[] args) {
        System.out.println("main start"); 
        
        try {
            System.out.println(0/0);  //  new ArithmeticException(); 

        }catch(Exception e) { // Excaption class 는 ArithmeticException class 의 부모타입. ( 다형성 )
            // 문제에 대한 파악
            //System.out.println("발생 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        

        System.out.println("main end");
    }
}
