

public class Ex02_Exception {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main start");
        
        try {
            for(int i = 0; i < 10; i++) {
                result = num / (int)(Math.random() * 10); // 0 ~ 9
                System.out.println("result : " + result + " i : " + i);
            }
        }catch(ArithmeticException e){  // 하위 예외(구체화, 특수화) 
            System.out.println("문제가 발생 로그 ... 관리자에게 메일 발송");
            System.out.println("원인 : " + e.getMessage());
        }catch(NullPointerException e){ // * catch 를 여러개 사용하고 싶으면 규칙상 하위예외를 먼저 선언하고 그 다음 상위예외 사용
           
        }catch(Exception e) {  // 부모타입
            // ArithmeticException 아니고 NullPointerException 아니면 실행.
        }

        
        System.out.println("main End");
    }
}
