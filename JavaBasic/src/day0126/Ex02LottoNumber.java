package day0126;
// 사용자로부터 로또 번호를 입력받는 프로그램
// 단 해당 번호가 중복이거나 1~45를 벗어나는 값이면
// 다시 입력 받도록 만드시오

import java.util.Scanner;
import java.util.Random;
public class Ex02LottoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 유저 입력 로또 번호
        int[] lottoNumber = new int[6];
        
        for(int i = 0; i < lottoNumber.length; i++) {
            System.out.printf("%d번 숫자를 입력해주세요 : ", i + 1);
            int userNumber = scanner.nextInt();
            
            while(userNumber < 1 || userNumber > 45) {
                System.out.println("1 ~ 45 사이 숫자만 입력하세요.");
                System.out.printf("%d번 숫자를 입력해주세요 : ", i + 1);
                userNumber = scanner.nextInt();
            }
            for(int j = 0; j < lottoNumber.length; j++) {
                if(userNumber == lottoNumber[j]) {
                    System.out.println("중복된 값입니다.");
                    System.out.printf("%d번 숫자를 입력해주세요 : ", i + 1);
                    userNumber = scanner.nextInt();
                    
                    while(userNumber < 1 || userNumber > 45) {
                        System.out.println("1 ~ 45 사이 숫자만 입력하세요.");
                        System.out.printf("%d번 숫자를 입력해주세요 : ", i + 1);
                        userNumber = scanner.nextInt();
                    }
                    
                    j = -1; 
                }
            }
            lottoNumber[i] = userNumber;
        }
        
        // 정렬
        for(int i = 0; i < lottoNumber.length - 1; i++) {
            if(lottoNumber[i] > lottoNumber[i + 1]) {
                int temp = lottoNumber[i];
                lottoNumber[i] = lottoNumber[i + 1];
                lottoNumber[i + 1] = temp;
                i = -1;
            }
        }
        
        
        
        // 컴퓨터 랜덤 로또 번호
        int[] computerLotto = new int[6]; 
        
        for(int i = 0; i < computerLotto.length; i++) {
            int computerLottoNumber = random.nextInt(45) + 1;
            for(int j = 0; j < computerLotto.length; j++) {
                if(computerLottoNumber == computerLotto[j]) {
                    computerLottoNumber = random.nextInt(45) + 1;
                    j = -1;
                }
            }
            computerLotto[i] = computerLottoNumber;
        }
        
        // 정렬
        for(int i = 0; i < computerLotto.length - 1; i++) {
            if(computerLotto[i] > computerLotto[i + 1]) {
                int temp = computerLotto[i];
                computerLotto[i] = computerLotto[i + 1];
                computerLotto[i + 1] = temp;
                i = -1;
            }
        }
        
        
        System.out.println("------ 사용자가 뽑은 로또 -------");
        for(int i = 0; i < lottoNumber.length; i++) {
            System.out.println("사용자가 뽑은 번호 : " + lottoNumber[i]);
        }
        
        System.out.println("------ 랜덤 로또 번호 -------");
        for(int i = 0; i < computerLotto.length; i++) {
            System.out.println("랜덤 로또 번호 : " + computerLotto[i]);
        }
        
        
        scanner.close();
    }
}
