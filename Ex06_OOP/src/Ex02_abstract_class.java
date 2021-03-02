/*
 게임 : Unit()
  
  Unit : 공통기동 (이동좌표, 이동, 멈춘다) : 추상화, 일반화
  Unit : 이동 방법은 다르다 (이동 방법은 Unit 마다 별도의 구현)
  추상클래스

 */
abstract class Unit{
    int x, y;
    
    void stop() {
        System.out.println("Unit stop");
    }
    
    abstract void move(int x, int y); // 추상자원 //강제구현   
}

//Tank
class Tank extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동 : " + this.x + " , " + this.y);
        
    }
    
    // Tank 구체화, 특수화
    void chaneMode() {
        System.out.println("탱크 변환 모드");
    } 
}

class Marine extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동 : " + this.x + " , " + this.y);        
    }
    
    // 특수화, 구체화
    void stimpack() {
        System.out.println("스팀팩 기능");
    }
    
}

class DropShip extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("DropShip 이동 : " + this.x + " , " + this.y);     
    }
    // 특수화, 구체화
    void load() {
        System.out.println("Unit Load..");
    }
    void unload() {
        System.out.println("Unit UnLoad");
    }
    
}

public class Ex02_abstract_class {

    public static void main(String[] args) {
        Tank t = new Tank();
        t.move(500, 200);
        t.stop();
        t.chaneMode();
        
        Marine m = new Marine();
        m.move(500, 200);
        m.stop();
        m.stimpack();
        
        // 1. 탱크 3대를 만들고 [같은 좌표] 이동 시키세요. (555,444)
        Tank[] tank = {new Tank(),new Tank(),new Tank()};
        for(int i = 0; i < tank.length; i++) {
            tank[i].move(555, 444);
        }
        
        // 2. 탱크 1, 마린 1, 드랍쉽 1 같은 좌표로 이동시키세요. ( 666, 444 )
        Tank t1 = new Tank();
        Marine m1 = new Marine();
        DropShip d1 = new DropShip();
        Unit[] u = {t1,m1,d1};
        
        
        for(int i = 0; i < u.length; i++) {
            u[i].move(666, 444);  
        }
     
                
        
        
    }

}
