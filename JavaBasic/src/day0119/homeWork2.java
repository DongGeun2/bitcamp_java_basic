package day0119;
//숙제 2.  사용자로부터 숫자 2개를 입력받아서 산술연산한 결과값을 출력하는
//프로그램을 작성하시오
import java.util.Scanner;
public class homeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("첫번째 숫자를 입력하세요: " );
        int num1 = scanner.nextInt();
        
        System.out.print("두번째 숫자를 입력하세요: " );
        int num2 = scanner.nextInt();
        
        System.out.printf("두 수의 덧셈 : %d\n", (num1 + num2));
        System.out.printf("두 수의 뺄셈 : %d\n", (num1 - num2));
        System.out.printf("두 수의 곱셈 : %d\n", (num1 * num2));
        System.out.printf("두 수의 나눗셈 몫 : %d\n", (num1 / num2));
        System.out.printf("두 수의 나눗셈 나머지 : %d", (num1 % num2));
        
        scanner.close();
    }

}
