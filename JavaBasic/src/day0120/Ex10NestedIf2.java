package day0120;
import java.util.Scanner;
public class Ex10NestedIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("성별: (1은 남자 2는 여자)");
        int gender = scanner.nextInt();
        if (gender == 1) {
            System.out.print("나이: ");
            int age = scanner.nextInt();
            
            if (age > 18) {
                System.out.print("신체등급: ");
                int category = scanner.nextInt();
                
                if (category <= 3) {
                    System.out.println("현역입니다.");
                }else if(category == 4) {
                    System.out.println("공익입니다.");
                }else {
                    System.out.println("면제입니다.");
                }
            }else {
                System.out.println("미성년자에게는 아직 신체등급이 부여되지 않았습니다.");
            }
            
        }else {
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }
            
        

        scanner.close();
        }
}

