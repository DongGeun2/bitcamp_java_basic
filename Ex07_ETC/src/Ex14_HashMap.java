import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 HashMap<k,v>
 
 HashMap<String, String>
 HashMap<Integer, String>
 HashMap<String, Emp>    >> values 여러개의 값을 가진다
 >> put("kim",new Emp());
 
 */

class Student{
    int kor;
    int math;
    int eng;
    String name;
    
    public Student(int kor, int math, int eng, String name) {
        super();
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
        
    }

    @Override
    public String toString() {
        return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
    }
    

}
public class Ex14_HashMap {
    public static void main(String[] args) {
        // 선생님이 학생마다 ID 부여
        HashMap<String, Student> sts = new  HashMap<String, Student>();
        sts.put("kim", new Student(100, 99, 88, "홍길동"));
        sts.put("hong", new Student(50, 40, 60, "김유신"));
        // 반 20명 데이터 관리
        
        Student std = sts.get("hong");
        System.out.println(std);
        
        // Tip 1
        // Map Key, value 관리
        Set set = sts.entrySet(); // >> key + "=" + value 하나의 문자열로 만들어서 관리
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //hong=Student [kor=50, math=40, eng=60, name=김유신]
        //kim=Student [kor=100, math=99, eng=88, name=홍길동]
        
        // Tip 2
        // 분리된 Key, value 획득
        // class Entry {Object key, Object value}
        // Map{ Entry[] elements } >> Map.Entry 인터페이스
        for(Map.Entry m : sts.entrySet()) {
            System.out.println(m.getKey() + "/"  + ((Student)m.getValue()).name);
        }
        // Map.Entry 타입으로 받으면 key 와 value 를 분리해서 얻을 수 있다.
        
    } 

}
