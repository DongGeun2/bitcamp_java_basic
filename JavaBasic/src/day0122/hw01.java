package day0122;
// 별찍기 8번 for - if 문 예제
import java.util.Scanner;
public class hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 8번*****");
        System.out.print("출력할 줄수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        for (int i = 1; i <= 2 * userNumber -1; i++) {
            String stars = new String();
            
            if( i <= userNumber - 1) {
                // 윗부분
                
                // 공백을 담당하는 j for 문
                for(int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }
                
                // 별을 담당하는 j for 문
                for(int j = 1; j <= i; j++) {
                    stars += "*";
                }
            }else {
                // 아랫부분
                int lowerI = i - userNumber + 1;
                // 공백을 담당하는 j for 문
                for(int j = 1; j <= lowerI - 1; j++) {
                    stars += " ";
                }
                
                // 별을 담당하는 j for 문
                for(int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
            }
            
            

            System.out.println(stars);
        }
        scanner.close();
    }
}
