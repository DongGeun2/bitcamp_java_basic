package day0120;
//숙제2 : 사용자로부터 점수를 입력받아 A, B, C, D, F 를 출력하는 프로그램을
//작성하세요. 단 잘못된 점수가 입력되면 올바른 점수가 입력될떄까지
//다시 입력을 받으세요
import java.util.Scanner;
public class homework02 {
    static final int A_SCORE = 90;
    static final int B_SCORE = 80;
    static final int C_SCORE = 70;
    static final int D_SCORE = 60;
    static final int SCORE_LIMIT_MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력해주세요 : ");
        int score = scanner.nextInt();
        while(score < 0 || score > SCORE_LIMIT_MAX) {
            System.out.println("점수는 0 미만 , 100 초과할수 없습니다. 다시 입력해주세요");
            System.out.print("점수를 입력해주세요: ");
            score = scanner.nextInt();
        }
        if (score >= A_SCORE) {
            System.out.println("A");
        }else if(score >= B_SCORE) {
            System.out.println("B");
        }else if(score >= C_SCORE) {
            System.out.println("C");
        }else if(score >= D_SCORE) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        scanner.close();
    }
}
