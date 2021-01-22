package day0121;
// 1. 1부터 10까지 출력되는 for 문을 작성하시오.
// 2. 8부터 3까지 출력되는 for 문을 작성하시오
// 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서
//    그 숫자들을 차례대로 출력하시오
// 4. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수까지의 홀수들만 출력하시오
// 5. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수 까지의 합을 구하시오
// 6. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수 까지의 곱을 구하시오

import java.util.Scanner;
public class Ex02For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 1부터 10까지 출력되는 for 문을 작성하시오.
        System.out.println("-----1번-----");
        for(int i = 1; i <= 10; i++) {
            System.out.println("1. i의 현재값 : " + i);
        }
        
        
        // 2. 8부터 3까지 출력되는 for 문을 작성하시오.
        System.out.println("-----2번-----");
        for(int i = 8; i >= 3; i--) {
            System.out.println("2. i의 현재값 : " + i);
        }
        
        // 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서
        //      그 숫자들을 차례대로 출력하시오
        System.out.println("-----3번-----");
        System.out.print("시작 숫자를 입력하세요: ");
        int start = scanner.nextInt();
        System.out.print("끝 숫자를 입력하세요: ");
        int end = scanner.nextInt();
        
        if(start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.println("3. i의 현재값 : " + i);
            }
        }else {
            for (int i = start; i >= end; i--) {
                System.out.println("3. i의 현재값 : " + i);
            }
        }

        
        // 4. 사용자로부터 숫자를 하나 입력 받아서
        //      1부터 그 수까지의 홀수들만 출력하시오
        System.out.println("-----4번-----");
        System.out.print("숫자를 입력하면 1부터 그 수까지의 홀수를 출력합니다.: ");
        int num1 = scanner.nextInt();
        
        for(int i = 1; i <= num1; i++) {
            if ( i % 2 == 1 ) {
                System.out.println("4. i의 현재값 : " + i);
            }
        }
        
        // 5. 사용자로부터 숫자를 하나 입력 받아서
        //      1부터 그 수 까지의 합을 구하시오
        System.out.println("-----5번-----");
        
        System.out.print("숫자를 입력하시면 1부터 그 수까지의 합을 출력합니다: ");
        int num2 = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i<= num2; i++) {
            sum += i; 
        }
        System.out.println("5. i의 현재값 : " + sum);
        
        // 6. 사용자로부터 숫자를 하나 입력 받아서
        //      1부터 그 수 까지의 곱을 구하시오
        System.out.println("-----6번-----");
        
        System.out.print("숫자를 입력하시면 1부터 그 수까지의 곱을 출력합니다: ");
        int num3 = scanner.nextInt();
        int factorial = 1;
        
        if (num3 >= 13) {
            System.out.println("오버플로우가 발생하여 정확한 결과를 출력할 수 없습니다.");
        }else {
            for (int i = 1; i<= num3; i++) {
                factorial *= i; 
            }   
            System.out.println("6. i의 현재값 : " +  factorial );
        }
       
        
     
        scanner.close();
    }
    

}
