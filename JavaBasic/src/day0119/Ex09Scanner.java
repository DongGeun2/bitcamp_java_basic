package day0119;
// Scanner 클래스
// Scanner 클래스의 변수는
// 자바의 각종 입력을 처리한다.
// 우리는 그 중에서 키보드 입력 처리를 배워보도록 하겠다.

// 단, Scanner 클래스는 자바에서 제공해주지만 기본 라이브러리에 포함되지
// 않으므로, 우리가 사용할려면 반드시 우리의 클래스에 "수입"해와야 한다.
// 수입 방법은 import java.util.Scanner 라고 적어주어야 한다.

// 1. 키보드 입력값을 String으로 읽어옴
// 2. 읽어온 String 값이 내가 호출한 메소드의
//    패턴과 일치하는지 체크
// 3. 일치하면 내가 원하는 데이터 타입으로 변환
// 4. 일치하지 않으면 에러 발생

import java.util.Scanner;
public class Ex09Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. int 를 입력 받을 때에는 Scanner 변수의
        // nextInt() 메소드를 실행하면 된다.
        System.out.print("숫자를 입력해주세요: ");
        int number = scanner.nextInt();
        System.out.println("사용자가 입력한 숫자: " + number);
        
        // 2. double을 입력 받을 때에는 Scanner 변수의
        //    nextDouble() 메소드를 실행하면 된다.
        System.out.print("실수를 입력해주세요: ");
        double d = scanner.nextDouble();
        System.out.println("사용자가 입력한 실수: " + d);
        
        // 3. String 입력 받을 때에는 Scanner 변수의
        //   nextLine() 메소드를 실행하면 된다.
        
        // 단, nextInt(), nextDouble()등의 숫자를 입력받는 메소드는
        // 버퍼메모리에 엔터키(=개행문자)를 남겨두고
        // 그다음 실행되는 nextLine() 메소드는 남겨진 엔터키를 보고
        // 사용자가 입력을 종료시켰다 라고 착각하게 된다.
        // 이 착각때문에 우리는 아무런 String 입력을 할수 없게 된다.
        // 따라서 우리는 버퍼메모리 안에 엔터키를 없애주기 위해서
        // 진짜 스트링 입력을 위한 nextLine()전에
        // 비워주는 nextLine()을 한번 실행시켜주어야 한다 !!!!!!!
        
        System.out.print("이름을 입력해주세요: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("사용자의 이름: " + name);
       
        
        scanner.close();
        
    }
}
