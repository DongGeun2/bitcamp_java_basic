import javax.swing.JOptionPane;

// 2개 함수가 개별로 별도 실행
// 1. 시간을 제어하는 Thread(stack) >> 별도 stack
// 2. 단어 입력을 처리하는 Thread(stack) >> main 함수에서 처리


class WordTime extends Thread{ 
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            try {
                System.out.println("남은 시간 : " + i);
                sleep(1000); // cpu를 점유하고 sleep 을 만나면 잠깐 휴식.
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


public class Ex04_Multi_Thread_word_Game {
    public static void main(String[] args) {
        // 2개
        // class WordTime extends Thread
        // static void main
        
        
        WordTime timer = new WordTime();
        timer.start();
        
        String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력 값 : " + inputdata);
        
        // 단어를 입력하지 않아도 시간은 흘러간다
        
        
    }

}
