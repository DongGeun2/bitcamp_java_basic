
interface Irepairable{
    
}


class Unit2{
    int hitpoint;  // 기본 에너지
    final int MAX_HP; // 최대 에너지
    Unit2(int hp){
        this.MAX_HP = hp;
    }
}

// 지상 유닛
class GroundUnit extends Unit2{
    GroundUnit(int hp){
        super(hp);
    }
}

// 공중 유닛
class AirUnit extends Unit2{
    AirUnit(int hp) {
        super(hp);
    }      
}

// 건물
class CommandCenter implements Irepairable{
    
}

// 탱크
class Tank2 extends GroundUnit implements Irepairable{
    Tank2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Tank2]";
    }  
}

// 마린
class Marine2 extends GroundUnit{
    Marine2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Marine2]";
    }  
}

// Scv 자원채취 (광물 , 치료)
class Scv extends GroundUnit implements Irepairable{
    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Scv]";
    } 
    
    // Scv 구체화 ,특수화된 기능
    // repair(수리하다)
    
    /*
    void repair(Tank2 tank) {
        if(tank.hitpoint != tank.MAX_HP) {
            System.out.println("파손....");
            tank.hitpoint += 5;
        }
    }
    
    void repair(Scv scv) {
        if(scv.hitpoint != scv.MAX_HP) {
            System.out.println("파손....");
            scv.hitpoint += 5;
        }
    }
    
    Unit 종류가 30개 정도... * (25개 치료가능)
    Scv repair 해야하는 Unit개수가 증가하면 함수의 개수도 같이 증가
    고민 : 하나의 함수가 Unit repair 할 수 있다면
    전자제품 ... 상속관계에서 부모타입 ... 다형성 사용 ... 같은거 아닌가 ?
    
    void repair(Unit unit){ } >> Marine2(x) , Scv(o), Tank2(o)
    void repair(GroundUnit unit >> Marine2(x) , Scv(o), Tank2(o)
    
    CommandCenter repair 대상 ( 유닛과 연관성이 없다) 
    
    고민 
    Marine2    Scv   Tank2   CommandCenter 서로 연관성이 없다...
    **인터페이스는 서로 연관성이없는 클래스를 하나로 묶어줄수 있다.
    
    인터페이스 Irepairable 부모 ... 가지고 ...
    
    class Scv extends GroundUnit       implements Irepairable
    class Tank2 extends GroundUnit     implements Irepairable
    class CommandCenter                implements Irepairable
    
    Irepairable는 Scv 부모 타입이다.
    Irepairable는 Tank2 부모 타입이다.
    Irepairable는 CommandCenter 부모 타입이다.
    
    */
    
    void repair(Irepairable repairable) {
    // repairable parameter 는 Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있다
    // void repair(new Tank2())
    // void repair(new CommandCenter())
    // void repair(new Scv())
    // 부모타입은 자식의타입의 주소를 받을 수 있는데 문제는 부모의 객체만 볼 수 있다.
    
    // CommandCenter와 Tank2, Scv 구분점 Unit2 이냐 아니냐로 구분가능
    // 타입비교 (연산자 : instanceof 
       // https://cafe.naver.com/bit2021/141
        if(repairable instanceof Unit2) {  // 부모타입이 Unit2 인 경우
            Unit2 unit = (Unit2)repairable;  // unit >> Tank2, Marine
            // Tank2 에서 부모타입인 Unit2 자원만 접근
            
            // ** 부모타입의 주소를 자식이 가질려면 자식타입으로 캐스팅 해야 한다.
            if(unit.hitpoint != unit.MAX_HP) {
                unit.hitpoint = unit.MAX_HP;
            }
        }else {
            //부모타입이 Unit2 가 아닌 경우
            System.out.println("다른 충전 방식을 통해서 ... Unit2 타입이 아니다.");
        }
       
        
    }
}



public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();
        
        // 전투
        tank.hitpoint -= 20;
        System.out.println("탱크 : " + tank.hitpoint);
        System.out.println("Scv 수리요청");
        
        scv.repair(tank);
        System.out.println("탱크 수리 완료 : "+ tank.hitpoint);
        
        scv.hitpoint -= 10;
        System.out.println("scv : " + scv.hitpoint);
        System.out.println("Scv 수리요청");
        
        scv.repair(scv);
        System.out.println("scv 수리 완료 : "+ scv.hitpoint);
        
        CommandCenter center = new CommandCenter();
        scv.repair(center);
        

    }
}
