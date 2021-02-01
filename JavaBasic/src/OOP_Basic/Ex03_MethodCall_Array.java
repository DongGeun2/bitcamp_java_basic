package OOP_Basic;

class Human{
    String name;
}

class Test{
    
    int add(int i, int j) {
        return i + j;
    }
    
    // 배열은 객체다 ( 배열은 주소값을 가지고 있다 : heap 생성)
    int[] add2(int[] param) { // int[] 주소값을 리턴값을 리턴, int[] 배열의 주소값을 받겠다
        int[] arr = new int[param.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = param[i] + 1;
        }
        return arr;
    }
    
    
    
    int[] add3(int[] so, int[] so2) {
        // return null;
        
        int[] sum = new int[so.length + so2.length];
        
        for(int i = 0; i < so.length; i++) {
            sum[i] = so[i];
            
        }

        for(int i = 0; i < so2.length; i++) {
            sum[i + so.length] = so2[i];
        }
        
        return sum;
        
    }
    
    // 함수안에 코드를 여러분 마음대로 작성하시고
    // main 안에서 가지고 놀아 보세요.
    // add3() error 없이...
    
}


public class Ex03_MethodCall_Array {
    public static void main(String[] args) {
        Test t = new Test();
        
        // add
        int result = t.add(10, 10);
        System.out.println(result);
        
        // add2
        int[] array = {10,20,30};
        int[] resultArray = t.add2(array);
        for(int i : resultArray) {
            System.out.println(i);
            
        }
        
        
        
        // add3
        System.out.println("------- add3 ------");
        int[] array1 = {10,20,30};
        int[] array2 = {40,50,60,70,80};
        
        int[] resultArray1 = t.add3(array1, array2);
        for(int i : resultArray1) {
            System.out.println(i);
        }
    }
}
