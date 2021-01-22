package day0120;
//숙제2 : 사용자가 번호, 이름, 국어, 영어, 수학 점수를 입력하면
//예쁘게 출력하는 프로그램을 작성하세요.
//단, 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를
//입력할 때 까지 다시 입력을 받는 프로그램을 만드세요.
import java.util.Scanner;
public class homework03 {
    static final int MAX_SCORE = 100;
    static final int MAX_SECTION = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호: ");
        int id = scanner.nextInt();
        
        System.out.print("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.print("국어: ");
        int korean = scanner.nextInt();
        while (korean < 0 || korean > MAX_SCORE) {
            System.out.printf("점수는 0미만 %d초과를 넘을수없습니다. 다시입력해주세요\n", MAX_SCORE);
            System.out.print("국어: ");
            korean = scanner.nextInt();
        }
        
        System.out.print("영어: ");
        int english = scanner.nextInt();
        while (english < 0 || english > MAX_SCORE) {
            System.out.printf("점수는 0미만 %d초과를 넘을수없습니다. 다시입력해주세요\n", MAX_SCORE);
            System.out.print("영어: ");
            english = scanner.nextInt();
        }
        
        System.out.print("수학: ");
        int math = scanner.nextInt();
        while (math < 0 || math > MAX_SCORE) {
            System.out.printf("점수는 0미만 %d초과를 넘을수없습니다. 다시입력해주세요\n", MAX_SCORE);
            System.out.print("수학: ");
            math = scanner.nextInt();
        }
        
        int sum = korean + english + math;
        double average = (double)sum / MAX_SECTION;
        
        
        System.out.printf("번호: %d 이름: %s\n", id,name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n", korean,english,math);
        System.out.printf("총점: %d점 평균 : %.2f점\n", sum,average);
        
        scanner.close();
    }

}
