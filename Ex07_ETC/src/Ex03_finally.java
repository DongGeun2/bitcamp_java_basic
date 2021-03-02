import java.io.IOException;

/*
 * 
 >> 게임 CD를 pc 에 설치..
 >> 1. 설치파일 > C:\Temp 복사
 >> 2. 복사한 파일 >> 게임설치
 >> 3. 정상설치 >> C:\Temp 복사한 파일 삭제
 >> 4. 비정상적인 문제가 발생(강제 종료)되어도 >> 복사한 파일 삭제
 
 
 
 
 복사한 파일 삭제 (강제) ....
 */
public class Ex03_finally {
    static void startInstall() {
        System.out.println("INSTALL");
    }
    static void copyFiles() {
        System.out.println("COPY FILES");
    }
    static void fileDelete() {
        System.out.println("FILE DELETE");
    }
    
    
    public static void main(String[] args) {
        // 3개의 함수가 정상 처리
        // 예외를 사용자가 필요에 따라서 강제
        // 실제로는 예외가 아니지만 
        // 개발자가 어떠한 상황에 대해서 강제로 예외로 지칭 가능
        // 1 이면 정상으로 보고 2 이면 강제로 예외를 발생해서 catch 
        // throw new IOException()
        
        try {
            copyFiles();
            startInstall();
            throw new IOException("install 도중 문제가 발생"); // 개발자가 임의로 발생
        }catch(Exception e){
            System.out.println("예외 메시지 출력 : " + e.getMessage());
            //fileDelete(); // 예외가 발생하지 않았을 경우
        }finally { // 예외가 발생하던 발생하지 않던 무조건 실행되는 블럭
            fileDelete();
            // 함수로 강제 종료 (return 을 만나면 함수 종료) 
            // 예외적으로 return에 의해서 종료되기 전에 호출
        }
        //fileDelete();
        System.out.println("main End");
    }

}
