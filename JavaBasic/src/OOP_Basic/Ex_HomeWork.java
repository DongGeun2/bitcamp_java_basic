package OOP_Basic;

class HomeWork{
    public int add(int[] num, int[] num2) {
        
        int numMax1 = 0;
        int numMax2 = 0;
        for(int i = 0; i < num.length; i++) {
            numMax1 = ( num[i] > numMax1 ) ? num[i] : numMax1;   
        }
        for(int i = 0; i < num2.length; i++) {
            numMax2 = ( num2[i] > numMax2 ) ? num2[i] : numMax2;      
        }
        
        
        return numMax1 + numMax2;
        
    }
    
}


public class Ex_HomeWork {
    public static void main(String[] args) {
        
        HomeWork sum = new HomeWork();
        
        int[] num1 = {90,91,92,93,100,101,150};
        int[] num2 = {100, 90, 50, 60,103};
        
        int sumnum = sum.add(num1, num2);
        
        System.out.println(sumnum);
        
        
        
    }

}
