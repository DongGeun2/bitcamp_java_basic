/*
 데몬 : 보조 thread
 
 주(메인) thread >> 주 thread가 종료하면 보조 thread도 같이 종료하게 작업 가능
 
  한글 >> 글쓰기 >> 3초마다 저장 옵션
  글쓰기 작업 종료 >> 3초마다 저장 (보조옵션) 종료
  
  
 
 
 */
public class Ex08_Damon_Thread implements Runnable{
    static boolean autosave = false;
    public static void main(String[] args) {
        Thread damonthread = new Thread(new Ex08_Damon_Thread());
        
        // damonthread 보조 (Damon)
        // main 함수 thread의 보조
        // main 함수가 끝나면 damonthread도 종료 하겠다.
        damonthread.setDaemon(true); // 데몬스레드 인것을 정의.
        damonthread.start();
        
        // 주 작업(한글 쓰기)
        for(int i = 0; i <= 30; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("main 한글 쓰기 작업 " + i);
            if(i==5) {
                System.out.println("i : " + i);
                autosave = true;
            }
        }

    }

    public void autoSave() {
        System.out.println("한글 작업이 3초 간격으로 자동 저장");
    }
    
    
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                
            }
            if(autosave) { // static boolean autosave = false;
                // 작업 (저장 작업)
                autoSave();
            }
        }
    }

}
