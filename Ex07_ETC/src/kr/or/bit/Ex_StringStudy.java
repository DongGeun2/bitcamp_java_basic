package kr.or.bit;
import java.util.Scanner;
//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner 사용 주민번호 입력받고
//앞:6자리 뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok) return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수 return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력

//3개의 함수 static 
class jumin{
    // 1. 자리수 체크
    public static boolean numLengthCheck(String num) {
        return num.length() == 14?true:false;
    }
    
    // 2. 뒷번호 첫번째 자리값 1~4
    public static boolean numFirst(String num) {
        return Integer.parseInt(String.valueOf((num.charAt(num.indexOf("-")+1)))) <= 0?
                false:Integer.parseInt(String.valueOf((num.charAt(num.indexOf("-")+1)))) > 4?false:true;
    }
    
    // 3.뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력
    public static void genderCheck(String num) {
        String number = num.substring(num.indexOf("-")+1,num.indexOf("-")+2);
        if(number.equals("1") || number.equals("3")) {
            System.out.println("남자입니다.");
        }else if(number.equals("2") || number.equals("4")) {
            System.out.println("여자입니다.");
        }else {
            System.out.println("주민등록번호의 첫 뒷번호는 1~ 4를 입력 하여야합니다.");
        }
    }
}

public class Ex_StringStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호를 입력해주세요 : ");
        String juminNumber = scanner.nextLine();
        
        System.out.println(jumin.numLengthCheck(juminNumber));
        System.out.println(jumin.numFirst(juminNumber));
        jumin.genderCheck(juminNumber);
    }
}
