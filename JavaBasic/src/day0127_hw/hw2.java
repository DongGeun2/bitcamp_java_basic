package day0127_hw;
/*
int[] number = new int[10];
10개의 방의 값을 1~10까지 값으로 초기화 해라
*/
public class hw2 {
    public static void main(String[] args) {
        int[] number = new int[10];
        
        for(int i = 0; i < number.length; i++) {
            number[i] = i + 1;

            
            System.out.printf("number[%d] 의 값 : %d\n", i, number[i] );
        }
       
        
    }
}
