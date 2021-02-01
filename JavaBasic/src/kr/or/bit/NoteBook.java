package kr.or.bit;

public class NoteBook {
    private String color;
    private int year;
    
    // 직접할당을 막고 간접 할당
    // 간접할당의 구현 (함수) >> 특수한 목적 (setter, getter)
    // 자동화 코드( 코드를 생략할수있는 장점이 생긴다.)
    public void setYear(int y) {  // setter
        if(y <= 0) {
            year = 1999;
        }else {
            year = y;
        }
    }
    
    public int getYear() { // getter
        return year;
    }
    
    // 자동화
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    // 마우스를 가지고 있다.
    // 여러개의 속성 과 기능  ( 마우스는 x,y 좌표를 가지고있다, 마우스는 클릭할수있다.)
    
    public void handle(Mouse m) { // Mouse 주소값을 받아서
        m.x = 100;
        m.y = 200;
        
    }
    
    public void noteBookInfo() {
        System.out.println("color : " + color + " yeat : " +  year);
    }


    
}
