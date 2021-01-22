package day0120;
//숙제1 : BMI 계산기를 만들어서 사용자의 BMI 수치와 현재 체중 상태를
//출력하는 프로그램을 작성하시오.
//단, 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지
//다시 입력을 받으세요
import java.util.Scanner;
public class homework01 {
    static final double MAX_WEIGHT = 465;
    static final double MAX_HEIGHT = 272;
    static final double BMI_LOW = 18.5;
    static final double BMI_MIDDLE = 23.0;
    static final double BMI_HIGH = 25.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몸무게를 입력하세요: ");
        double weight = scanner.nextDouble();
        while (weight <= 0 || weight >= MAX_WEIGHT) {
            System.out.printf("몸무게는 0이상 %.0f이하의 값으로 적어주세요.\n", MAX_WEIGHT);
            System.out.print("몸무게를 입력해주세요: ");
            weight = scanner.nextDouble();
        }
        
        System.out.print("키를 입력해주세요: ");
        double height = scanner.nextDouble();
        while (height <= 0 || height >= MAX_HEIGHT) {
            System.out.printf("키는 0이상 %.0f이하의 값으로 적어주세요.\n", MAX_HEIGHT);
            System.out.print("키를 입력해주세요: ");
            height = scanner.nextDouble();
        }
        
        double bmi = weight / (height / 100) / (height / 100);
        System.out.printf("사용자의 BMI수치는 : %.2f\n", bmi );
        
        if(bmi < BMI_LOW) {
            System.out.println("저체중입니다.");
        }else if(bmi < BMI_MIDDLE) {
            System.out.println("정상 체중입니다.");
        }else if(bmi < BMI_HIGH) {
            System.out.println("과체중입니다.");
        }else {
            System.out.println("고도비만입니다.");
        }
        
        
     
        scanner.close();
       
    }
}
