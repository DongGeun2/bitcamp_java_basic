package day0119;
//숙제 3. 사용자로부터 생년, 생월, 생일을 따로따로 입력 받아서
//형식에 맞추어 출력해보도록 합니다.
//심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면
//     주민등록번호의 앞자리처럼 처리를 해봅시다.
import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("생년 : ");
        int y = scanner.nextInt();
        
        System.out.print("생월 : ");
        int m = scanner.nextInt();
        
        System.out.print("생일 : ");
        int d = scanner.nextInt();
        
        System.out.printf("생년 : %d\n", y);
        System.out.printf("생월 : %d\n", m);
        System.out.printf("생일 : %d\n", d);
        
        System.out.printf("%d%d%d", (y % 100),m,d);
        scanner.close();
    }
}
