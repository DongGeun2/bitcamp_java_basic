package day0125;
//숙제
//가위바위보 게임을 만드세요
//가위 : int 1
//바위 : int 2
//보 : int 3

//예시 :
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 5
//잘못입력하셨습니다.
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 2
//사용자 : 바위
//컴퓨터 : 가위
//사용자 승 !!!
//현재 전적 : 1승 3무 2패
//1. 플레이  2. 현재 전적 보기 3. 종료
//> 2
//현재 전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트 입니다.
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 3
//사용해주셔서 감사합니다.
import java.util.Scanner;
import java.util.Random;
public class hw01 {
    static final int USER_START = 1;
    static final int USER_SCORE = 2;
    static final int USER_END = 3;
    static final int SCISSORS = 1;
    static final int ROCK = 2;
    static final int PAPER = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        double win = 0;
        double draw = 0;
        double lose = 0;
        
        while(true) {
            System.out.println("1. 플레이  2. 현재 전적 보기   3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            
                // 1. 플레이
            if( userChoice == USER_START ) {
                int computerNumber = random.nextInt(3) + 1;
                
                System.out.println("가위바위보 중 하나를 선택해주세요 (가위: 1, 바위: 2, 보: 3)");
                System.out.print("> ");
                int userNumber = scanner.nextInt();
                while( userNumber < USER_START || userNumber > USER_END ) {
                    System.out.println("가위: 1, 바위: 2, 보: 3 를 입력하세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                }
                if(userNumber == SCISSORS) {
                    System.out.println("사용자 : 가위");
                }else if(userNumber == ROCK) {
                    System.out.println("사용자 : 바위");
                }else if(userNumber == PAPER) {
                    System.out.println("사용자 : 보");
                }
                
                if(computerNumber == SCISSORS) {
                    System.out.println("컴퓨터 : 가위");
                }else if(computerNumber == ROCK) {
                    System.out.println("컴퓨터 : 바위");
                }else if(computerNumber == PAPER) {
                    System.out.println("컴퓨터 : 보");
                }


                if(( userNumber == SCISSORS && computerNumber == PAPER)||
                    ( userNumber == ROCK && computerNumber == SCISSORS)||
                     (userNumber == PAPER && computerNumber == ROCK)) {
                    System.out.println("사용자 승리 !!!");
                    win ++;
                    System.out.printf("현재 전적 %.0f승 %.0f무 %.0f패 \n",win,draw,lose);
                }else if( userNumber == computerNumber) {
                    System.out.println("무승부 !!");
                    draw ++;
                    System.out.printf("현재 전적 %.0f승 %.0f무 %.0f패 \n",win,draw,lose);
                }else {
                    System.out.println("컴퓨터 승리 !");
                    lose ++;
                    System.out.printf("현재 전적 %.0f승 %.0f무 %.0f패 \n",win,draw,lose);
                }
                
                
                // 2. 현재 전적 보기
            }else if( userChoice == USER_SCORE ) {
                if( win == 0 && draw == 0 && lose == 0) {
                    System.out.println("아직 게임을 진행하지 않았습니다. 게임을 진행하세요");
                }else {
                    double average = ( win / ( win + draw + lose )) * 100;
                    System.out.printf("현재 전적 %.0f승 %.0f무 %.0f패 승률은 : %.4f 퍼센트입니다. \n",win,draw,lose, average);
                }
                
 
                
                // 3. 종료
            }else if( userChoice == USER_END ) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
                
                // 다른값 들어올시
            }else {
                System.out.println("1. 플레이  2. 현재 전적 보기   3. 종료");
                System.out.print(">");
                userChoice = scanner.nextInt();    
            }
        }
        
        scanner.close();
       
    }
}
