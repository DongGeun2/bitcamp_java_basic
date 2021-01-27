package day0126;
// 로또번호 제작기 최종단계
// 컴퓨터가 뽑은 숫자 6개 vs 내가 뽑은 숫자 6개
// 1등 : 번호 6개
// 2등 : 번호 5개
// 3등 : 번호 4개
// 4등 : 번호 3개
// 5등 : 번호 2개

// 컴퓨터가 뽑은 숫자 6개중에서 내가 뽑은 숫자가 몇개가 일치하는지 확인하고
// 등수를 표시하도록 합니다.
// 예시:
// 컴퓨터의 숫자 : [2, 4, 27, 33, 41, 45]
// 내 숫자 : [1, 2, 3, 4, 5, 6]
// 내 등수 : 5등
import java.util.Scanner;
import java.util.Random;
public class Ex03LottoNumbers02 {
    static final int SIZE = 6;
    static final int MAX = 45;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int[] lottoNumber = new int[SIZE];
        int[] computerLottoNumber = new int[SIZE];
        int count = 0;
        
        // 유저 로또 번호
        for(int i = 0; i < lottoNumber.length; i++) {
            System.out.printf("%d번 로또 번호 : ", i + 1);
            int userLottoNumber = scanner.nextInt();
            
            while(userLottoNumber < 1 || userLottoNumber > MAX) {
                System.out.println("번호를 잘못입력하였습니다.");
                System.out.printf("%d번 로또 번호 : ", i + 1);
                userLottoNumber = scanner.nextInt();
            }
            
            for(int j = 0; j < lottoNumber.length; j++) {
                if(userLottoNumber == lottoNumber[j]) {
                    System.out.println("중복된 번호입니다. 다시 입력해주세요");
                    System.out.printf("%d번 로또 번호 : ", i + 1);
                    userLottoNumber = scanner.nextInt();
                    
                    while(userLottoNumber < 1 || userLottoNumber > MAX) {
                        System.out.println("번호를 잘못입력하였습니다.");
                        System.out.printf("%d번 로또 번호 : ", i + 1);
                        userLottoNumber = scanner.nextInt();
                    }
                    j = -1;
                }
            }
            lottoNumber[i] = userLottoNumber;
        }
        
        for(int i = 0; i < lottoNumber.length -1; i++) {
            if(lottoNumber[i] > lottoNumber[i + 1]) {
                int temp = lottoNumber[i];
                lottoNumber[i] = lottoNumber[i + 1];
                lottoNumber[i + 1] = temp;
                i = -1;
            }
        }
        
        // 컴퓨터 랜덤 로또 번호
        for(int i = 0; i < computerLottoNumber.length; i++) {
            int computerRandomNumber = random.nextInt(MAX) + 1;
            
            for(int j = 0; j < computerLottoNumber.length; j++) {
                if(computerRandomNumber == computerLottoNumber[j]) {
                    computerRandomNumber = random.nextInt(MAX) + 1;
                    j = -1;
                } 
            }
            computerLottoNumber[i] = computerRandomNumber;
        }
        
        for(int i = 0; i < computerLottoNumber.length -1; i++) {
            if(computerLottoNumber[i] > computerLottoNumber[i + 1]) {
                int temp = computerLottoNumber[i];
                computerLottoNumber[i] = computerLottoNumber[i + 1];
                computerLottoNumber[i + 1] = temp;
                i = -1;
            }
        }
        
        // 사용자 번호와 컴퓨터 번호를 비교
        for(int i = 0; i < lottoNumber.length; i++) {
            for(int j = 0; j < lottoNumber.length; j++) {
                if(lottoNumber[i] == computerLottoNumber[j]) {
                    count += 1;
                }
            }
        }
        
        
        System.out.println("------ 사용자가 뽑은 로또 -------");
        System.out.printf("[%d %d %d %d %d %d]\n", lottoNumber[0],lottoNumber[1],lottoNumber[2],
                lottoNumber[3],lottoNumber[4],lottoNumber[5]);
        System.out.println("------ 당첨 번호 -------");
        System.out.printf("[%d %d %d %d %d %d]\n", computerLottoNumber[0],computerLottoNumber[1],computerLottoNumber[2],
                computerLottoNumber[3],computerLottoNumber[4],computerLottoNumber[5]);
        
        System.out.println("------ 당첨 결과 -------");
        if(count == 2) {
            System.out.println("내 등수 : 5등");
        }else if(count == 3) {
            System.out.println("내 등수 : 4등");
        }else if(count == 4) {
            System.out.println("내 등수 : 3등");
        }else if(count == 5) {
            System.out.println("내 등수 : 2등");
        }else if(count == 6) {
            System.out.println("내 등수 : 1등");
        }else {
            System.out.println("꽝!");
        }
        
        scanner.close();
    }
}
