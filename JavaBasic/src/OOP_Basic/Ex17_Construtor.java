package OOP_Basic;
/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 기본 사양을 살 수 도 있고 ....  여러가지 선택 옵션을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 4개 , 자동차의 색상 기본은 red  4개가 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다

자동차 구매
1. 기본 사양  
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 자동차의 색상 변경 , 문 기본
4. 옵션 : 자동차의 색상 변경 , 문 변경
*/

// 이 코드는 좋은 코드는 아니다. 
//  why ?? 
// 1. parameter 이름이 모호하다. (보통 member field 명이랑 똑같이 쓴다.... 같이쓰면 충돌)  >> this
// 2. 개발자의 성격상 반복되는 코드를 싫어한다. >> this
class Car6{
    private int carDoor;
    private String carColor;
    private String option;
    
    public Car6(){
        carDoor = 4;
        carColor = "Red";
        option = "기본";
    }
    public Car6(int door) {
        carDoor = door;
        carColor = "Red";
        option = "옵션1";
    }
    public Car6(String color) {
        carColor = color;
        carDoor = 4;
        option = "옵션2";
    }
    public Car6(int door, String color) {
        carDoor = door;
        carColor = color;
        option = "옵션3";
        
    }
    
    public void carInfo() {
        System.out.printf("%s, 차 색상 : %s, 문의 갯수 : %d\n", option, carColor, carDoor);
    }
}
public class Ex17_Construtor {

    public static void main(String[] args) {
        Car6 car = new Car6();
        
        Car6 car1 = new Car6(2);
        
        Car6 car2 = new Car6("blue");
        
        Car6 car3 = new Car6(2, "pink");

        
        car.carInfo();
        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
    }

}
