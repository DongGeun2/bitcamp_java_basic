package day0121_hw;
// 별찍기 10번 for - if 문 예제
import java.util.Scanner;
public class hw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 10번*****");
        System.out.print("출력할 줄수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2 * userNumber -1; i++) {
            String stars = new String();
            // 윗부분 담당 for 문
            if(i <= userNumber - 1) {
                for(int j = i; j <= userNumber; j++) {
                    stars += "*";
                }
                for(int j = 1; j < i * 2 - 2; j++) {
                    stars += " ";
                }
                for(int j = i; j <= userNumber; j++) {
                    if( j == 1) {
                        stars += "";
                    }else {
                        stars += "*";
                    } 
                }
                System.out.println(stars);
            }else {
                // 아랫부분 담당 for문
                int lowerI = i - userNumber + 1;
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }
                for(int j = userNumber; j > lowerI; j--) {
                    stars += " ";
                }
                for(int j = userNumber-1; j > lowerI; j--) {
                    stars += " ";
                }
                for(int j = 1; j <= lowerI; j++) {
                    if(j == userNumber) {
                        stars += "";
                    }else {
                        stars += "*";
                    }
                }
                System.out.println(stars);
            }
        }
        
        
        
        scanner.close();
    }
}
