package OOP_Basic;
/*
함수의 parameter 로 
값 전달

주소값 전달

*/
class Data{
    int i;
}

public class Ex13_Method_Call {

    public static void main(String[] args) {
        Data d = new Data();
        d.i = 100;
        System.out.println("d.i : " + d.i);
        
        scall(d); // Data 라는 타입을 갖는 주소 값을 parameter로 넘겨야한다. // 주소값을 parameter 
        
        System.out.println("after d.i : " + d.i);
        
        vcall(d.i);
        System.out.println("after d.i : " + d.i);
    }
    
    static void scall(Data sdata) {
        System.out.println("함수 : " + sdata.i); // 주소값 할당 
        sdata.i = 111;
    }
    static void vcall(int x) {
        System.out.println("before x : " + x);
        
        x = 8888;
        System.out.println("after x : " + x);
    }
    
}
