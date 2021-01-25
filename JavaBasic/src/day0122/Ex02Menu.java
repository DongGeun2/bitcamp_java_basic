package day0122;
// 무한 루프를 사용한 메뉴 만들기
import java.util.Scanner;
public class Ex02Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 입력하는 코드 구현
                
            }else if(userChoice == 2) {
                // 출력하는 코드 구현
                
            }else if(userChoice == 3) {
                // 종료하는 코드 구현
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
            
        }
        
        
        
        
        scanner.close();
    }

}
