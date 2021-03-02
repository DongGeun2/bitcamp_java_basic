// 상의 인터페이스
interface TobSize{
    public static final int S = 90;
    public static final int M = 95;
    public static final int L = 100;
    public static final int XL = 105;
    public static final int XXL = 110;
    
    public void sizeCheck(String size);
}
// 하의 인터페이스
interface BottomSize{
    public static final int S = 28;
    public static final int M = 29;
    public static final int L = 30;
    public static final int XL = 31;
    public static final int XXL = 32;
    
    public void sizeCheck(String size);
}

// 옷 (추상클래스)
abstract class Clothes{
    abstract void fabric(String name);
}

// 상의
class Top extends Clothes implements TobSize{
    @Override
    void fabric(String name) {
        System.out.println("원단은 : "+ name +" 입니다.");
        
    }  
    public void Up_waist() {
        System.out.println("상의입니다.");
    }
    @Override
    public void sizeCheck(String size) {
        if(size == "S") {
            System.out.println("S사이즈 :" + TobSize.S);
            System.out.println("팔길이 : 75");
            System.out.println("둘레 : 78");
        }else if(size == "M") {
            System.out.println("S사이즈 :" + TobSize.M);
            System.out.println("팔길이 : 78");
            System.out.println("둘레 : 81");
        }else if(size == "L") {
            System.out.println("S사이즈 :" + TobSize.L);
            System.out.println("팔길이 : 81");
            System.out.println("둘레 : 84");
        }else if(size == "XL") {
            System.out.println("S사이즈 :" + TobSize.XL);
            System.out.println("팔길이 : 83");
            System.out.println("둘레 : 87");
        }else if(size == "XXL") {
            System.out.println("S사이즈 :" + TobSize.XXL);
            System.out.println("팔길이 : 87");
            System.out.println("둘레 : 90");
        }
    }
 
}
// 니트
class Knit extends Top{
    void wool() {
        System.out.println("보들보들하고 따뜻한 니트");
    }

    @Override
    public String toString() {
        return "Knit";
    }
}
// 셔츠
class Shirts extends Top{
    void button() {
        System.out.println("단추를 채워서 입어주세요.");
    }
    @Override
    public String toString() {
        return "Shirts";
    }
}
// 티셔츠
class T_Shirts extends Top{
    void cotton() {
        System.out.println("깔끔한 티셔츠입니다.");
    }
    @Override
    public String toString() {
        return "T_Shirts";
    }
}


// 하의
class Bottom extends Clothes implements BottomSize{
    @Override
    void fabric(String name) {
        System.out.println("원단은 : "+ name +" 입니다.");
        
    }  
    public void Down_waist() {
        System.out.println("하의입니다.");
    }
    
    @Override
    public void sizeCheck(String size) {
        if(size == "S") {
            System.out.println("S사이즈 :" + BottomSize.S);
            System.out.println("바지기장 : 80");
            System.out.println("허리둘레 : 56");
        }else if(size == "M") {
            System.out.println("S사이즈 :" + BottomSize.M);
            System.out.println("바지기장 : 83");
            System.out.println("허리둘레 : 59");
        }else if(size == "L") {
            System.out.println("S사이즈 :" + BottomSize.L);
            System.out.println("바지기장 : 85");
            System.out.println("허리둘레 : 62");
        }else if(size == "XL") {
            System.out.println("S사이즈 :" + BottomSize.XL);
            System.out.println("바지기장 : 87");
            System.out.println("허리둘레 : 64");
        }else if(size == "XXL") {
            System.out.println("S사이즈 :" + BottomSize.XXL);
            System.out.println("바지기장 : 90");
            System.out.println("허리둘레 : 66");
        }
    }
    
}
// 바지
class Pants extends Bottom{
    boolean crotch_T() {
        boolean leg = true;
        System.out.println("두 다리를 넣어 입어주세요.");
        return leg;
    }
    @Override
    public String toString() {
        return "Pants";
    }
}
// 치마
class Skir extends Bottom{
    boolean crotch_F() {
        boolean leg = false;
        System.out.println("다리를 넣지 않고 입어도 됩니다.");
        return leg;
    }
    @Override
    public String toString() {
        return "Skir";
    }
}



public class ClothesMain {
    public static void main(String[] args) {
        Knit knit = new Knit();
        Shirts shirts = new Shirts();
        T_Shirts t_shirts = new T_Shirts();
        Pants pants = new Pants();
        Skir skir = new Skir();
        
        knit.wool();
        knit.fabric("Woo");
        System.out.println();
        shirts.button();
        shirts.fabric("linen");
        System.out.println();
        t_shirts.cotton();
        t_shirts.fabric("cotton");
        
        pants.crotch_T();
        skir.crotch_F();

        knit.sizeCheck("S");
    }

}
