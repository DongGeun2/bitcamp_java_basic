package day0125;
// 배열(Array)
// 배열이란 지정된 크기만큼의 똑같은 데이터타입이 모여있는 하나의 자료형을
// 배열이라고 한다.

// 배열은 다음과 같이 선언을 하게 된다.
// 데이터타입[] 배열이름 = new 데이터타입[크기]
// 배열은 우리가 맨 처음에 지정한 크기만 다룰 수 있다.
// 예를 들어서 우리가 선언할 때
// 크기를 4 라고 하면
// 총 4개의 데이터타입을 묶어서 다루게 된다.

// 또한 우리가 변수를 일일히 이름을 붙여서 다루는것이 아니라
// 배열의 "몇번째" 라는 식으로 다루게 된다.
// 예를 들어 우리가 int 배열 intArray 의 2번째 값을 할당할 때에는
// intArray[2] = 30; 이런 식으로
// 값을 할당하거나
// 값을 호출할 때에는
// System.out.println(intArray[2]);
// 이렇게 호출 가능하다.

// 기본형 데이터타입의 배열은 모든 위치를 0으로 초기화한다.
// 참조형 데이터타입의 배열은 모든 위치를 null로 초기화한다.

// null 이란 특수한 "상태"로써, 참조형 데이터타입이 메모리 주소값을 부여가 되었지만
// 해당 메모리 주소값을 참조해서 들어가면 아무것도 없는 상태를 null이라고 하고
// null 인 상태에서는 새로운 값을 할당하는 것 외에는 아무것도 할 수 없다.

// 또한 배열의 존재하지 않는 위치를 접근할려고 한다면
// ArrayIndexOutOfBoundExecption, 즉 잘못된 위치 접근 에러가 발생하게 된다.
// 위치를 지정하는 "위치 번호"는 우리가 index 라고 부른다.
// 배열의 인덱스는 0부터 (해당 배열 크기 -1) 까지이다.

// Q : 그렇다면 크기가 5인 배열의 인덱스 범위는?
// A : 0 부터 4

public class Ex01Array {
    public static void main(String[] args) {
        // int 타입의 배열 intArray
        int[] intArray = new int[5];
        
        // 배열의 각 인덱스를 접근할 때에는
        // 변수를 써서 접근 가능하다.
        // 그렇다면 0부터 4번까지 차례대로 출력하고 싶다면
        // 무엇을 사용해야할까?
        // for 반복문을 사용하면 된다!
        for(int i = 0; i< 5; i++) {
            System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
        }
        
        // 배열의 2번 인덱스에 45를 넣어보자
        intArray[2] = 45;
        
        // 배열의 2번 인덱스를 할당된 값을 출력해보자
        System.out.println(intArray[2]);
        
        String[] stringArray = new String[3];
        
        // 배열의 지정된 크기를 호출할 때에는
        // 배열이름.length 로 호출 가능하다.
        
        System.out.println("intArray 배열의 크기: " + intArray.length);
        System.out.println("stringArray 배열의 크기: " + stringArray.length);
        
        // 참조형 데이터타입의 배열인 stringArray의 값을 출력해보자
        for(int i = 0; i < stringArray.length; i++) {
            System.out.printf("stringArray[%d]: %s\n", i, stringArray[i]);
           
        }
        
        // 우리가 참조형 데이터타입의 배열만 초기화하면
        // 각 인덱스에 있는 String은 null 상태가 된다.
        // null 상태에서는 아무런 메소드도 실행할 수 없다!
        //System.out.println(stringArray[0].equals("abc"));
        
        // 그렇다면 null 은 어떻게 비교해야할까?
        // null 은 "상태" 이므로 비교연산자를 사용하여 비교해야한다.
        
        System.out.println(stringArray[0] == null);
        
        // 배열의 크기도 우리가 변수를 통해서 지정해줄 수 있다.
        int size = 4;
        int[] intArray2 = new int[size];
        System.out.println("intArray2의 크기: " + intArray2.length);
    }
}
