import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

//Quiz 에 대한 정보 (문제 , 입력한 답 , 결과 )
class QuizInfo2 {
    String question;
    int answer;
    String result;
    
    public QuizInfo2(String question, int answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "문제:"+this.question+" 쓴답:"+this.answer+" 채점:"+this.result;
    }
}


public class Ex06_GuGuDan {

    public static void main(String[] args) {
        //hint_1 : HashMap 구구단 만들기 
        HashMap<String, Integer> gugudan = new HashMap<String, Integer>();
        
        for(int i = 0 ; i < 5 ; i++) {
            int num1 = (int)(Math.random()*9)+1;
            int num2 = (int)(Math.random()*9)+1;
            gugudan.put(num1+"*"+num2, num1*num2);
        }
        
        for(Map.Entry m : gugudan.entrySet()) {
            System.out.println(m.getKey() + "/" +m.getValue());
        }
        
        //hint_3
        //처리 결과 (문제 , 사용자가 입력한 값 , 유무) 관리
        //class QuizInfo 
        ArrayList<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();
        
        
        //hint_2
        //gugudan  문제와  답 비교하기 (문제 .... 답값 받기)
        Set keys = gugudan.keySet();
        Object[] keylist = keys.toArray();
        int answer=0;
        for(int i = 0 ; i < keylist.length ; i++) {
            answer = Integer.parseInt(JOptionPane.showInputDialog((String)keylist[i]));
            System.out.println(answer);
            if(gugudan.get(keylist[i])==answer) {
                System.out.println("당신은 정답");
                QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "O"));
            }else {
                System.out.println("당신은 오답");
                QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "X"));
            }
        }
        
        for(int i = 0 ; i < QuizUserInfo.size() ; i++) {
            System.out.println(QuizUserInfo.get(i).toString());
        }
        
        
        

    }

}
