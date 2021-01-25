package day0122;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력받아서
// 예쁘게 출력하는 프로그램
// 단, 사용자가 메뉴에서 1이라고 입력할 때 마다 새로운 정보를
// 입력할수 있어야 한다.
// 또한 사용자가 메뉴에서 2라고 입력할 때 마다 입력된 정보를 
// 출력할수 있어야 한다.
// 만약 사용자가 메뉴에서 3이라고 입력하면 프로그램은 종료된다.

import java.util.Scanner;
public class Ex03GradeBook {
    static final double MAX_SECTION = 3.0;
    static final int MAX_SCORE = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int id = 0;
        String name = new String();
        int korean = 0;
        int english = 0;
        int math = 0;
        boolean userString = false;
       
        while(true) {
            System.out.println("1. 입력  2. 출력  3. 종료");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                System.out.print("번호를 입력해주세요 : ");
                id = scanner.nextInt();
                
                System.out.print("이름을 입력해주세요 : ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                System.out.print("국어 : ");
                korean = scanner.nextInt();
                while(korean < 0 || korean > MAX_SCORE) {
                    System.out.printf("점수는 0점미만 %d점을 초과할수없습니다.\n", MAX_SCORE);
                    System.out.print("국어 : ");
                    korean = scanner.nextInt();
                }
                System.out.print("영어 : ");
                english = scanner.nextInt();
                while(english < 0 || english > MAX_SCORE) {
                    System.out.printf("점수는 0점미만 %d점을 초과할수없습니다.\n", MAX_SCORE);
                    System.out.print("영어 : ");
                    english = scanner.nextInt();
                }
                
                System.out.print("수학 : ");
                math = scanner.nextInt();
                while(math < 0 || math > MAX_SCORE) {
                    System.out.printf("점수는 0점미만 %d점을 초과할수없습니다.\n", MAX_SCORE);
                    System.out.print("수학 : ");
                    math = scanner.nextInt();
                }
                
                userString = true;
                
            }else if(userChoice == 2) {
                if(userString == false) {
                    System.out.println(" 입력 값이 입력 되지않았습니다. ");
                }else {
                    int sum = korean + english + math;
                    double average = sum / MAX_SECTION;
                    
                    System.out.printf("번호: %02d번 이름: %s\n", id, name);
                    System.out.printf("국어점수: %02d점 영어점수: %02d점 수학점수: %02d점\n", korean,english,math);
                    System.out.printf("총점: %02d점 평균: %.2f점\n", sum, average);
                }

            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
   
        }
        
        
        scanner.close();
    }
}
