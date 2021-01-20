package day0119;
// 사용자로부터
// 번호 이름 국어 영어 수학 점수를 차례대로 입력 받아
// 다음처럼 출력될 수 있게 프로그램을 작성하시오
// 예시)
// 번호: 002번 이름: 조재영
// 국어: 004점 영어: 002점 수학: 001점
// 총점: 007점 평균: 02.33점
import java.util.Scanner;
public class Ex13GradeBook3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호를 입력하세요: ");
        int id = scanner.nextInt();
        System.out.print("이름을 입력하세요: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("국어 : ");
        int k = scanner.nextInt();
        
        System.out.print("영어 : ");
        int e = scanner.nextInt();
        
        System.out.print("수학 : ");
        int m = scanner.nextInt();
        
        int sum = k + e + m;
        double average = sum / 3.0;
        
        System.out.printf("번호 : %03d 이름 : %s\n", id, name);
        System.out.printf("국어 : %03d 영어 : %03d 수학 : %03d\n", k,e,m);
        System.out.printf("총점 : %03d 평균 : %.2f", sum,average);
        
    }
}

// 숙제 1.  사용자로부터 키와 몸무게를 입력받아서
//         BMI 수치를 어느정도 형식에 맞추어 출력하시오
//         BMI 계산 방법은 몸무게 / 키 / 키 입니다.
// 숙제 2.  사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는
//         프로그램을 작성하시오
// 숙제 3. 사용자로부터 생년, 생월, 생일을 따로따로 입력 받아서
//        형식에 맞추어 출력해보도록 합니다.
//        심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면
//               주민등록번호의 앞자리처럼 처리를 해봅시다.

