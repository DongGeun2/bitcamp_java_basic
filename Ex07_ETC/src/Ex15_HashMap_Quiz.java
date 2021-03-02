import java.util.HashMap;
import java.util.Set;

//Thread  할때 .....
class QuizInfo {
    String question;
    String answer;
    String result;
    
    public QuizInfo(String question, String answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "문제:"+this.question+" 쓴답:"+this.answer+" 채점:"+this.result;
    }
}
public class Ex15_HashMap_Quiz {

    public static void main(String[] args) {
        HashMap<String, String> quiz = new HashMap<>();
        quiz.put("1+1", "2");
        quiz.put("1+2", "3");
        quiz.put("1+3", "4");
        
        for(int i = 0 ; i < quiz.size() ; i++) {
            Set set =quiz.keySet();
            Object[] obj= set.toArray();
            //System.out.println(obj.length);
            System.out.println("문제:" + obj[i]);
            System.out.println(quiz.keySet().toArray()[i]);
            
            
            System.out.println(quiz.get(quiz.keySet().toArray()[i]));
        }

    }

}
