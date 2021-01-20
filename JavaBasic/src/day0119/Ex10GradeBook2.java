package day0119;
// 사용자로부터
// 나이 이름
// 국어 영어 수학
// 순으로 입력 받아서
// 나이, 이름, 국어, 영어, 수학, 총점, 평균
// 이 출력되는 프로그램을 작성하시오
import java.util.Scanner;
public class Ex10GradeBook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이를 입력해주세요 : ");
        int age = scanner.nextInt();
        System.out.print("이름을 입력해주세요 : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("국어점수를 입력해주세요 : ");
        int k = scanner.nextInt();
        System.out.print("영어점수를 입력해주세요 : ");
        int e = scanner.nextInt();
        System.out.print("수학점수를 입력해주세요 : ");
        int m = scanner.nextInt();
        
        int sum = k + e + m;
        double average = sum / 3.0;
        
        System.out.println("나이: " + age + " 이름: " + name);
        System.out.println("국어점수 : " + k + " 영어점수 : " + e + " 수학점수 : " + m);
        System.out.println("총점 : " + sum + " 평균 : " + average);
        
        
        scanner.close();
    }
}
