/*
 프로그램 실행 >> 프로세스(동작하고 있는 프로그램) >> 최소 하나의 스레드(stack) >> JVM은 하나의 main thread(stack)생성
 지금까지 프로그램은 싱글 프로세스 >> 싱글 스레드(stack 1개) >> main 함수가 stack을 점유하고 실행되고 있었음
 
 JVM > call stack > main 함수 동작
 
 ***
 stack은 한번에 1개의 함수만 실행 가능 (10개의 함수가 있더라도 동시에 실행이 아니라 순차적으로 하나씩 실행)
   
   
 ********************************
 * 지금까지 하나의 stack 메모리만 사용 *
 * 
 ******************************** 
   
 */
public class Ex01_Single_Thread {

    public static void main(String[] args) {
        System.out.println("나 main 일꾼이야");
        worker();
        worker2();
        System.out.println("main 종료");
    }
    static void worker() {
        System.out.println("나 1번 일꾼이야");
    }
    static void worker2() {
        System.out.println("나 2번 일꾼이야");
    }
}
