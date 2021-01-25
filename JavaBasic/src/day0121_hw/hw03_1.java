package day0121_hw;
// 별찍기 10번 for - if 문 예제
// 강사님 풀이과정
import java.util.Scanner;
public class hw03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 10번*****");
        System.out.print("출력할 줄수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2 * userNumber -1; i++) {
            String stars = new String();
            
            int totalWidth = 2 * userNumber -1;
            
            if(i == 1 || i == 2 * userNumber -1) {
                // 첫번째 줄 혹은 제일 마지막줄 인 경우
                // 별 2*userNumber -1 개 만큼 넣어준다.
                for(int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }
            }else if( i <= userNumber - 1) {
                // 첫번째 줄을 제외한 윗부분
                int upperI = i - 1;
                
                // 해당 줄의 왼쪽 혹은 오른쪽의 별 갯수
                int starWidth = userNumber - upperI;
                
                // 왼쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                // 해당 줄의 공백의 갯수
                // = 총 너비 - 별의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                // 가운데 공백 부분
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                // 오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }else {
                // 맨 마지막 줄을 제외한 아랫부분
                int lowerI = i - userNumber + 1;
                
                // 해당 줄의 별의 갯수
                int starWidth = lowerI;
                
                // 왼쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                // 해당 줄의 공백의 갯수
                // = 총 너비 - 별의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                // 가운데 공백 부분
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                // 오른쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }
        
            System.out.println(stars);
            }

        
        
        
        
        
        scanner.close();
    }
}
