package day0125;
// 1. 크기가 4인 int 배열을 만들어서
//    3 -4 22 11 이란 값을 넣어보세요
// 2. 크기가 3인 String 배열을 만들어서
//    "김철수" "이영희" "jane Doe"란 값을 넣어보세요
// 3. 크기가 6인 배열을 만들어서
//    사용자로부터 1~45의 값을 입력하도록 하시오.
//    단 사용자가 범위를 벗어난 값을 입력하면 올바른 범위의 값이 들어올때까지
//    다시 입력을 받으세요
// 4. 사용자로부터 3개의 이름을 입력 받아
//    String 배열에 저장하세요

import java.util.Scanner;

public class Ex02Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1.
        int[] intArray = new int[4];
        intArray[0] = 3;
        intArray[1] = -4;
        intArray[2] = 22;
        intArray[3] = 11;
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d] : %d\n", i, intArray[i]);
        }
        
        // 2.
        String[] stringArray = new String[3];
        stringArray[0] = "김철수";
        stringArray[1] = "이영희";
        stringArray[2] = "Jane Doe";
        
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("stringArray[%d] : %s\n", i, stringArray[i]);
        }
        // 3.
        int[] intUserArray = new int[6];

        

        for(int i = 0; i < intUserArray.length; i++) {
            System.out.print(" 1 ~ 45 의 값을 입력하세요: ");
            int number = scanner.nextInt();
            while(number <= 0 || number > 45) {
                System.out.print("1 이상 45 이하의 값만 입력하세요.");
                number = scanner.nextInt();
            }

            intUserArray[i] = number;
            
        }
        
        for(int i = 0; i < intUserArray.length; i++) {
            System.out.printf("intuserArray[%d] 의 값은:  %d\n", i , intUserArray[i]);
        }
        
        //4. 
        String[] stringArray2 = new String[3];
        scanner.nextLine();
        
        for(int i = 0; i < stringArray2.length; i++) {
            System.out.print("이름을 입력해주세요: ");
            String name = scanner.nextLine();
            
            stringArray2[i] = name;
 
        }
        
        for(int i = 0; i < stringArray2.length; i++) {
            System.out.printf("stringArray2[%d] 의 값은: %s\n", i, stringArray2[i]);
        }
        
        scanner.close();

    }
}
