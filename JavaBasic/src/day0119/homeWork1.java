package day0119;
//숙제 1.  사용자로부터 키와 몸무게를 입력받아서
//BMI 수치를 어느정도 형식에 맞추어 출력하시오
//BMI 계산 방법은 몸무게 / 키 / 키 입니다.
import java.util.Scanner;
public class homeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몸무게를 입력하세요: " );
        double w = scanner.nextInt();
        
        System.out.print("키를 입력하세요: " );
        double h = scanner.nextInt();
        
        double bmi = w / (h / 100) / (h / 100);
        
        System.out.printf("입력하신 몸무게는 : %.2f\n" , w);
        System.out.printf("입력하신 키는 : %.2f\n" , h);
        System.out.printf("BMI : %.2f" , bmi);
    }
}
