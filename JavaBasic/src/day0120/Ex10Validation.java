package day0120;
// 사용자로부터 키와 몸무게를 입력 받아서
// BMI를 계산하는 프로그램을 작성하시오
// 기네스북에 따르면 세계에서 가장 키가 컸던 사람은 2.72m 였습니다.
// 키네스북에 따르면 세계에서 가장 무거웠던 사람은 465kg 였습니다.
// 2개의 정보를 사용해서 데이터 검증도 적용하세요.
import java.util.Scanner;
public class Ex10Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몸무게를 입력해주세요 : ");
        double weight = scanner.nextDouble();
        
        System.out.print("키를 입력해주세요 : ");
        double height = scanner.nextDouble();
        
        if(height >= 0 && height < 272 && weight >= 0 && weight <= 465) {
            double bmi = weight / ( height / 100 ) / ( height / 100 );
            System.out.printf("사용자의 BMI: %.3f\n", bmi);
            
            if(bmi < 18.5) {
                System.out.println("저체중입니다.");
            }else if(bmi < 23) {
                System.out.println("정상 체중입니다.");
            }else if(bmi <25) {
                System.out.println("과체중입니다.");
            }else {
                System.out.println("고도비만입니다.");
            }
            
        }else {
            System.out.println("키 혹은 몸무게가 잘못되었습니다.");
            
        }
        
        
        scanner.close();
    }
    
}
