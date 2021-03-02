import java.util.Properties;

/*
 Map 인터페이스를 구현한 클래스
 특수한 목적 : <String, String> (key, value) 강제 되어있다.
 사용 목적 
 DB연결정보 ( id = kglim, pwd = 1004 )
 App 전체에 사용되는 자원 관리
 환경변수
 프로그램 버전
 공통 파일 경로
 공통 변수
 
 */
public class Ex16_Properties {

    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("admin", "bit@bit.co.kr");
        prop.setProperty("version", "1.x.x.x");
        prop.setProperty("path", "C:\\Temp\\images");
        // 각각의 개발 페이지
        System.out.println(prop.getProperty("admin"));
        System.out.println(prop.getProperty("version"));
        
    }

}
