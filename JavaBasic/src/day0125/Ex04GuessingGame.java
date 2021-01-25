package day0125;
// 컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를
// 사용자가 몇번만에 맞추는지 기록하는
// 숫자맞추기 게임
// 조건. 무한루프를 사용해서
//       사용자가 1을 누르면 게임 시작
//       2를 누르면 최고점수 보기
//       3을 누르면 게임 종료 가 될수 있도록
//       프로그램을 작성하시오
//       단 최고 점수는 가장 적은 횟수로 컴퓨터의 숫자를 맞춘 횟수가 최고점수가 됩니다.
//       또한 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 DOWN, 작으면 UP이라고
//       출력되어야 합니다.
//       사용자가 컴퓨터의 숫자를 맞출때까지 계속 입력을 받도록 합니다.

// 힌트1. 최고점수는 어떻게 기록해야할까?
//       최고점수는 맨 처음 플레이하면 어떤게 최고점수가 될까?
// 힌트2. random.nextInt(최대값) 을 입력하면
//       0부터 최대값-1까지의 값이 랜덤하게 나온다
//       그렇다면 어떻게 해야 1~최대값의 범위가 나오도록
//       만들어줄 수 있을까?
//       random.nextInt(10) -> 0 1 2 3 4 5 6 7 8 9
//       random.nextInt(10) + 1 -> 1 2 3 4 5 6 7 8 9 10

import java.util.Scanner;
import java.util.Random;
public class Ex04GuessingGame {
    static final int USER_CHOICE1 = 1;
    static final int USER_CHOICE2 = 2;
    static final int USER_CHOICE3 = 3;
    static final int GAME_MAX_NUMBER = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        int[] score = new int[10];
        int userNumber = 0;
        int count = 1;
        
        while(true) {
            System.out.println("1. 게임시작    2.  스코어 확인    3. 게임종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            // 1 ~ 100 사이 랜덤수
            int randomNumber = random.nextInt(GAME_MAX_NUMBER) + 1;
            
            // 1. 게임시작
            if(userChoice == USER_CHOICE1) {
                System.out.printf("%d번 유저 - 게임을 시작합니다.\n", userNumber + 1);
                System.out.printf("1 부터 %d사이의 숫자를 맞추면 성공입니다.\n",GAME_MAX_NUMBER);
                
                System.out.print("숫자를 입력해주세요: ");
                int userChoiceNumber = scanner.nextInt();
                
                while(userChoiceNumber <= 0 || userChoiceNumber > GAME_MAX_NUMBER) {
                    System.out.printf("숫자는 1 부터 %d사이의 숫자만 입력 가능합니다.\n",GAME_MAX_NUMBER);
                    System.out.print("숫자를 입력해주세요: ");
                    userChoiceNumber = scanner.nextInt();
                }
                
                if(randomNumber > userChoiceNumber) {
                    System.out.printf("입력하신 숫자인 %d 보다 UP!\n", userChoiceNumber);
                }else if(randomNumber < userChoiceNumber){
                    System.out.printf("입력하신 숫자인 %d 보다 DOWN!\n", userChoiceNumber);
                }

                
                if (randomNumber == userChoiceNumber) {
                    System.out.println("※※정답입니다※※");
                    
                    count ++;
                    score[userNumber] = count;
                    userNumber ++;
                }else {
                    while(randomNumber != userChoiceNumber) {
                        System.out.print("정답이 아닙니다. 다시 입력해주세요 : ");
                        userChoiceNumber = scanner.nextInt();
                        while(userChoiceNumber <= 0 || userChoiceNumber > GAME_MAX_NUMBER) {
                            System.out.printf("숫자는 1 부터 %d사이의 숫자만 입력 가능합니다.\n",GAME_MAX_NUMBER);
                            System.out.print("숫자를 입력해주세요: ");
                            userChoiceNumber = scanner.nextInt();
                        }
                        if(randomNumber > userChoiceNumber) {
                            System.out.printf("입력하신 숫자인 %d 보다 UP!\n", userChoiceNumber);
                        }else if(randomNumber < userChoiceNumber){
                            System.out.printf("입력하신 숫자인 %d 보다 DOWN!\n", userChoiceNumber);
                        }

                        count ++;
                        score[userNumber] = count;
                        
                        if(randomNumber == userChoiceNumber) {
                            System.out.println("※※정답입니다※※");
                            count ++;
                            score[userNumber] = count;
                            userNumber ++;
                        }
                    }
                }
                
             // 2. 스코어 확인   
            }else if(userChoice == USER_CHOICE2) {
                System.out.println("스코어 게시판");
                for(int i = 0; i < score.length; i++) {
                    if(score[i] != 0) {
                        System.out.printf("%d번 유저의 점수는 %d점\n", i + 1, score[i]);
                    }else if(score[0] == 0){
                        System.out.println("아무런 점수가 없습니다. 게임을 시작하여 점수를 기록해주세요.");
                        break;
                    } 
                }

             // 3. 게임종료 
            }else if(userChoice == USER_CHOICE3) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
        
        
        
        scanner.close();  
    }
}
