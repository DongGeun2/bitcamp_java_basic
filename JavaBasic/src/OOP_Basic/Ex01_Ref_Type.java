package OOP_Basic;

import kr.or.bit.Apt;
import kr.or.bit.Body_Info;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;


public class Ex01_Ref_Type {

    public static void main(String[] args) {
        Emp emp = new Emp(); // 참조변수(주소값 변수)
        System.out.println(emp);
        //kr.or.bit.Emp@26f0a63f 주소값(변형)
        //kr.or.bit.Emp + @ + 주소
        
        // emp.number =-100; // 직접할당
        // System.out.println(emp.number);
        
        emp.setNum(-10); 
        int result = emp.getNum();
        System.out.println("result : " + result);
        
       // int num = 100; // 값타입 변수
       //  System.out.println(num);
        
        emp.setEname("홍길동");
        String name = emp.getEname();
        System.out.println("name : " + name);
        
        
        
        // 답 : 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기 위해서
        Apt sapt = new Apt();
        sapt.door = 20;
        System.out.println(sapt.door);
        System.out.println("주소: " + sapt );
        // kr.or.bit.Apt@762efe5d
        
        Apt lapt = new Apt();
        lapt.door = 10;
        System.out.println(lapt.door);
        System.out.println("주소: " + lapt );
        // kr.or.bit.Apt@5d22bbb7
        
        Apt mapt = new Apt();
        System.out.println(mapt.door);
        System.out.println("주소: " + mapt );
        // kr.or.bit.Apt@41a4555e
        
        
        // 값 할당
        int i = 10;
        int j;
        j = i;
        j = 100;
        // i 값도 100이 되나요?
        
        
        // 주소값 할당
        Apt apt = new Apt();
        Apt kapt = apt;
        
        apt.door = 9999;
        System.out.println(kapt.door);
        
        int[] arr = new int[5];
        int[] arr2 = arr; // 주소값 할당
        // 같은 주소를 참조 합니다.
        
        // 값타입 (8가지)
        // 참조타입 ( class, Array )
        
        Apt ap; // 선언 (stack 영역에 공간만 확보 : default 4byte 할당)
        ap = new Apt(); // 할당 (ap 라는 변수가 메모리를 갖는다) (객체의 주소값을 갖는다)
        // 선언과 할당을 분리 할 수 있다.
        System.out.println("ap 주소값 : " + ap);        
        ap = null;
        System.out.println("ap 주소값 : " + ap);        
        
        // 초기화
        Apt ap2;  // main 함수안에 있는 변수 scope local >> 사용시에는 초기화를 해야한다.
        ap2 = null;
        System.out.println(ap2);
        
        Apt ap3 = new Apt();
        System.out.println(ap3.car);
        
        Apt ap4 = new Apt();
        
        Apt ap5 = ap4;
        //주소값 비교
        // ==
        System.out.println(ap3 == ap4); // 비교 ( 변수가 가지고 있는 값)
        System.out.println(ap4 == ap5); // true ( 두 놈은 같은 주소를 가지고 있다.)
        
        
        
        Tv bittv = new Tv();
        
        bittv.brandname = "비트";
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        
        bittv.tv_Info();
        
        
        Person person = new Person();
        person.id = 7788;
        person.name = "김유신";
        person.job = "IT";
        person.money = 1000;
        
        // 방법 1
        //person.body_Info = new Body_Info();
        //person.body_Info.heigth = 190;
        //person.body_Info.weigth = 40;
        
        // 방법 2
        Body_Info info = new Body_Info();
        info.heigth = 190;
        info.weigth = 40;
        
        person.body_Info = info;
        
        
        System.out.printf("사번: %d, 이름: %s, 부서: %s\n", person.id, person.name, person.job);
        System.out.printf("키: %d, 몸무게: %d\n", person.body_Info.heigth, person.body_Info.weigth);

    }
    

}









