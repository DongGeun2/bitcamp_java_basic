package day0121;
// 별찍기 10번
import java.util.Scanner;
public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 10번*****");
        System.out.print("출력할 줄수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        // 윗부분 i for문
        for(int i = 1; i <= userNumber-1; i++) {
            String stars = new String();
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
        }
            // 아랫부분 i for문
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            for(int j = userNumber; j > i;  j--) {
                stars += " ";
            }
            for(int j = userNumber - 1; j > i;  j--) {
                stars += " ";
            }

            for(int j = 1; j <= i; j++) {
                if( j == userNumber) {
                    stars += "";
                }else {
                    stars += "*";  
                }
                            
            }
            System.out.println(stars);
        }
 
        scanner.close();
        
    }
}
