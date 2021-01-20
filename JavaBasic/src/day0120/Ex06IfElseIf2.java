package day0120;
// 1. 사용자로부터 숫자를 입력받아서
//    해당 숫자가 한자리, 두자리, 세자리, 네자리 이상의 숫자 중 어떤 것인지
//    보여주는 프로그램
// 2. 사용자로부터 나이를 입력받아서
//    ~5 : 영아
//    ~13 : 어린이
//    ~18 : 청소년
//    19~ : 성인
// 3. 사용자로부터 점수를 입력받아서
//    90점이상 : A
//    80점대 : B
//    70점대 : C
//    60점대 : D
//    그외 : F
//    가 출력되는 프로그램
import java.util.Scanner;
public class Ex06IfElseIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1.
        System.out.print("숫자를 입력해주세요: " );
        int number = scanner.nextInt();
        
        if (number < 10) {
            System.out.println("한자리 숫자입니다.");
        }else if(number < 100) {
            System.out.println("두자리 숫자입니다.");
        }else if(number < 1000) {
            System.out.println("세자리 숫자입니다.");
        }else {
            System.out.println("네자리 이상의 숫자입니다.");
        }
        
        // 2.
        System.out.print("나이를 입력해주세요: " );
        int age = scanner.nextInt();
        if (age <= 5) {
            System.out.println("영아 입니다.");
        }else if(age <=13) {
            System.out.println("어린이 입니다.");
        }else if(age <=18) {
            System.out.println("청소년 입니다.");
        }else if(age >= 19) {
            System.out.println("성인 입니다.");
        }
        
        // 3. 
        System.out.print("점수를 입력해주세요: " );
        int sum = scanner.nextInt();
        
        if (sum >= 90) {
            System.out.println("A");
        }else if(sum >= 80) {
            System.out.println("B");
        }else if(sum >= 70) {
            System.out.println("C");
        }else if(sum >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        scanner.close();
    }

}
