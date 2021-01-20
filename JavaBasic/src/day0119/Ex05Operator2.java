package day0119;
// 할당연산자
// 할당연산자는 오른쪽 값을 연산해서
// 왼쪽 공간에 넣는 역할을 맡는다.

// =, +=, -=, *=, /=, %=, ++, --
public class Ex05Operator2 {
    public static void main(String[] args) {
        int number;
        
//      1. = 은 오른쪽 값을 왼쪽 공간에 할당한다.
        number = 5;
        System.out.println("1. number = 5 결과값: "+ number);
        
//      2. += 은 왼쪽 공간의 현재 값에 오른쪽 값을 더한 결과값을
        //    왼쪽 공간에 다시 할당한다.
        //    +=은 String에도 사용가능하다.
        number += 4;
        System.out.println("2. number += 4 결과값: " + number);
        
        String str = new String("123");
        str += 45;
        System.out.println("2. str += 45 결과값: "+ str);
        
//      3. -= 은 왼쪽 공간의 현재 값에 오른쪽 값을 뺀 결과값을
        //    왼쪽 공간에 다시 할당한다.
        number -= 2;
        System.out.println("3. number -= 2 결과값: "+ number);
        
//      4. *= 은 왼쪽 공간의 현재 값에 오른쪽 값을 곱한 결과값을
        //    왼쪽 공간에 다시 할당한다.
        number *= 4;
        System.out.println("4. number *= 4 결과값: " + number);
        
//      5. /= 은 왼쪽 공간의 현재 값에 오른쪽 값을 나눈 몫을
        //    왼쪽 공간에 다시 할당한다.
        number /= 3;
        System.out.println("5. number /= 3 결과값: " + number);
       
//      6. %= 은 왼쪽 공간의 현재 값에 오른쪽 값을 나눈 나머지를
        //    왼쪽 공간에 다시 할당한다.
        number %= 7;
        System.out.println("6. number %= 7 결과값:" + number);
        
        // ++ 와 -- 은 해당 공간의 값을 1씩 변화시키는데
        // 변수의 앞에 붙냐 뒤에 붙냐에 따라서 실행시점이 달라지게 된다.
        
        System.out.println(++number);
        // ++ 혹은 --가 변수의 앞에 붙어있을 경우,
        // 해당 줄에서 가장 먼저 실행이 된다.
        // 즉 위의 System.out.println(++number)의 경우
        // 먼저 ++number가 실행되서 number의 현재 값이 1 증가 된다.
        // 그리고 나서 System.ouy.println()이 실행되면서
        // 1 증가된 number의 현재 값이 화면에 출력이 된다.
        System.out.println("number의 현재값: "+ number);
        
        
        // 반대로 ++ 혹은 -- 가 뒤에 붙으면 그 줄에서
        // 가장 마지막에 실행이 된다.
        System.out.println(number++);
        System.out.println("number의 현재값: "+ number);
    }
}
