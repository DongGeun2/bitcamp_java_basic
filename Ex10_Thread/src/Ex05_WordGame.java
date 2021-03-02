import javax.swing.JOptionPane;

/*
 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하고 싶다.
 hint) 공유자원
 
 
 
 */
class WordInputProcess extends Thread{
    @Override
    public void run() {
        String dan = "2";
        String inputdata = JOptionPane.showInputDialog(dan + "단 값을 입력");
        if(inputdata != null && !inputdata.equals("")) {
            Ex05_WordGame.inputcheck = true;
        }
        System.out.println("입력한 값은 :" + inputdata);
    }   
}

class WordTimeOut extends Thread{
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            if(Ex05_WordGame.inputcheck) return; // run함수 빠져나가는 것은 stack 종료
            System.out.println("남은 시간 : " + i);
            try {
                Thread.sleep(1000); // 1초간 쉬었다가 다시 실행
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


public class Ex05_WordGame {
    static boolean inputcheck = false; // 공유
    public static void main(String[] args) {
       // 공유자원 
        WordInputProcess wi = new WordInputProcess();
        WordTimeOut wt = new  WordTimeOut();
        wi.start();
        wt.start();
        try {
            // join : 다른 Thread의 종료를 기다린다.
            // join을 요청한 thread가 종료되면 그때 동작 ...
            wi.join(); // main에게 wi 가 끝날때까지 기다려 달라 요청
            wt.join(); // main에게 wt 가 끝날때까지 기다려 달라 요청
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("main END");
    }

}
