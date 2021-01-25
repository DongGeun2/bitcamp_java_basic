package day0122;
// BMI 계산기에 메뉴를 적용시켜 프로그램을 완성시키시오.
import java.util.Scanner;
public class Ex04BMI {
    static final double MAX_HEIGHT = 272;
    static final double MAX_WEIGHT = 465;
    static final double LOW_BMI = 18;
    static final double NORMAL_BMI = 23;
    static final double OVER_BMI = 25;
    static final int USER_SELECT = 1;
    static final int USER_PRINT = 2;
    static final int USER_END = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double weight = 0;
        double height = 0;
        boolean userString = false;
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            int userChoice = scanner.nextInt();
            
            if( userChoice == USER_SELECT ) {
                System.out.print("몸무게를 입력해주세요: ");
                weight = scanner.nextDouble();
                while(weight <= 0 || weight > MAX_WEIGHT) {
                    System.out.printf("몸무게는 0이하 %.0f이상을 넘을수 없습니다.\n", MAX_WEIGHT);
                    System.out.print("몸무게를 입력해주세요: ");
                    weight = scanner.nextDouble();
                }
                System.out.print("키를 입력해주세요: ");
                height = scanner.nextDouble();
                while(height <= 0 || height > MAX_HEIGHT) {
                    System.out.printf("키는 0이하 %.0f이상을 넘을수 없습니다.\n", MAX_HEIGHT);
                    System.out.print("키를 입력해주세요: ");
                    height = scanner.nextDouble();
                }
                userString = true;
            }else if(userChoice == USER_PRINT ) {
                if(userString == false) {
                    System.out.println("입력값에 값을 넣어주세요.");
                }else {
                    double bmi = weight / (height /100) / (height /100);
                    
                    System.out.printf("사용자의 BMI는 %.2f\n", bmi);
                    if(bmi < LOW_BMI) {
                       System.out.println("저체중 입니다.");
                    }else if(bmi < NORMAL_BMI) {
                        System.out.println("정상체중 입니다.");
                    }else if(bmi < OVER_BMI) {
                        System.out.println("과체중 입니다.");
                    }else {
                        System.out.println("고도비만 입니다.");
                    }
                }

            }else if(userChoice == USER_END ) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
        scanner.close();   
        
    }
}
