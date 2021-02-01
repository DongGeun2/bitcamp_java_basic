package kr.or.bit;

// 창문의 수
// 속도를 가지고 있다

// 2가지 속성은 캡슐화
// 속도는 - 값이 오면 0으로 초기화

// 속도를 10씩 올리거나 감소하는 기능을 만드세요
// 속도가 - 값을 가지면 0으로 초기화

public class Car {
    private int window;
    private int speed;
    
    public void SetWindow(int w) {
        window = w;
    }
    public int getWindow() {
        return window;
    }
    
    public void SetSpeed(int s) {
        if (s <= 0) {
            speed = 0;
        }else {
            speed = s;
        }
    }
    public int getSpeed() {
        return speed;
    }
    
    public void speedUP() {
        speed += 10;
        System.out.println("속도가 10 증가했습니다.");
        System.out.println("현재 속도 : " + speed);
    }
    public void speedDown() {
        if(speed <= 0) {
            System.out.println("속도는 0 이하로 내려갈수 없습니다.");
            speed = 0;
        }else {
            speed -= 10;
            System.out.println("속도가 10 감소했습니다.");
            System.out.println("현재 속도 : " + speed);
        }
    }
    
    public void carInfo() {
        System.out.println("창문의 갯수 : " + window + " 현재 차의 속도 : " + speed);
    }
    
} 
