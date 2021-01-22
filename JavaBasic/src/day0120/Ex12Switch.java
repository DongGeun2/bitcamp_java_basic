package day0120;
// 조건문 02 - SWITch
// if 조건문은 우리가 true / false가 나올수 있는 조건식을 만들어서
// 해당 조건식이 true가 나올때에 코드블락이 실행이 되었지만
// switch 조건문은 우리가 조건식이 아닌 값이 변화될 수 있는
// 변수를 선택해서 그 변수의 값에 따른 코드를 정의하는 형태의
// 조건문이다

// switch 조건문의 형태:
// switch(변수) {
// case 값:
//     실행할 코드
//     break;
// case 값:
//     실행할 코드
//     break;
// default:
//     실행할 코드
//     break;
// }

// switch 는 double을 사용할수없다
// 그 이유는 정확하게 떨어지는 값만 사용할수있다.

public class Ex12Switch {
    public static void main(String[] args) {
        int number = 2;
        
        switch(number) {
        case 1:
            System.out.println("1 입니다.");
            break;
        case 3:
            System.out.println("3 입니다.");
            break;
        case 2:
            System.out.println("2 입니다.");
            break;
        default:
            System.out.println("그 외 입니다.");
            break;
        }
    }
}





