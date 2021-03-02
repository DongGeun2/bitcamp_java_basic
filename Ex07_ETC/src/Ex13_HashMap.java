import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

    public static void main(String[] args) {
        // 지역번호, 출석부, 우편번호, 회원가입
        HashMap loginmap = new HashMap();
        loginmap.put("kim", "1004");
        loginmap.put("scott", "tiger");
        loginmap.put("lee", "kim1004");
        
        // 회원가입은 처리 끝났음 (회원정보)
        // 로그인 시스템
        // id(o), pwd(o) >> 회원님 방가
        // id(o), pwd(x) >> 비밀번호 입력
        
        // id(x), pwd(o) >>
        // id(x), pwd(x) >>
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("id . pwd 입력해주세요");
            System.out.println("ID");
            String id = scanner.nextLine().trim().toLowerCase();
            
            System.out.println("PWD");
            String pwd = scanner.nextLine().trim();
            
            if(!loginmap.containsKey(id)) {
                // id(x)
                System.out.println("id 맞지 않습니다 재입력");
            }else {
                // id(o)
                if(loginmap.get(id).equals(pwd)) {
                    System.out.println("회원님 방가방가");
                    break;
                }else {
                    System.out.println("비번 확인");
                }
            }
            
            
        }

    }

}
