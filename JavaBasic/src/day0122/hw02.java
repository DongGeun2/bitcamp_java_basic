package day0122;
// 별찍기 9번 for - if 문 예제
import java.util.Scanner;
public class hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 9번*****");
        System.out.print("출력할 줄수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            if( i <= userNumber - 1) {
                for(int j = i; j < userNumber; j++) {
                    stars += " ";
                }
                for(int j = 1; j <= i; j++) {
                    stars += "*";
                }
                for(int j = 2; j <= i; j++) {
                    stars += "*";
                }
                System.out.println(stars);
            }else {
                int lowerI = i - userNumber + 1;
                for(int j = 1; j < lowerI; j++) {
                    stars += " ";
                }
                for(int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
                for(int j = lowerI + 1; j <= userNumber; j++) {
                    stars += "*";
                }
                System.out.println(stars);
            }
        }
        scanner.close();
    }
}
