package OOP_Basic;
import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {

    public static void main(String[] args) {
        Fclass fclass = new Fclass();
        fclass.m();
        
        fclass.m2(100);
        
        int result = fclass.m3();
        System.out.println(result);
        
        result = fclass.m4(200);
        System.out.println(result);
        
        result = fclass.sum(10, 20, 30);
        System.out.println(result);
        
        fclass.callSubSum();
        
        boolean bo =  fclass.opSum(20);
        System.out.println(bo);
        
        fclass.max(100, 100);
        
        Tv tv = fclass.tCall(); // Tv 타입을 가지는 주소값을 받는다.
        System.out.println("t : " + tv);
        
        Tv tv2 = new Tv();
        fclass.tCall2(tv2); //주소 값 전달

    }

}
