import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map 인터페이스
 Map ( Key, value) 쌍의 구조를 갖는 배열
  ex) (02, 서울) (031, 경기)
 Key : 키값은 중복을 허용하지 않는다.
 Value : 중복 허용
 generic 지원 ( key, value 타입 강제화 가능 )
 
 Map 인터페이스 구현
 구버전 : HashTable( 동기화 보장 )
 신버전 : HashMap( 동기화 강제 x ) : 성능고려
  
 
 */
public class Ex12_Map_Interface {

    public static void main(String[] args) {
        //HashMap<K, V>
        HashMap map = new HashMap();
        map.put("Tiger","1004");
        map.put("scott","1004");
        map.put("superman", "1004");
        // 사용자 ID, PWD 
        
        // 중복아이디 검사....
        System.out.println(map.containsKey("tiger")); // 대소문자구분 false
        
        System.out.println(map.containsKey("scott")); // true
        System.out.println(map.containsValue("1004")); // 하나라도 있으면 true
        System.out.println(map.containsValue("1007")); // false
        
        // point
        // key 제공하면 value 값을 알 수 있다.
        System.out.println(map.get("superman")); // value 값 return
        System.out.println(map.get("hong")); // 해당 키에 해당하는 value 값이 없으면 null 값 return
        
        map.put("Tiger", "1007"); // Key 중복 (x) value 값을 overwrite 한다. (덮어 쓴다)
        System.out.println(map.get("Tiger"));
        System.out.println(map.size());
        
        
        Object value = map.remove("superman");
        System.out.println("value : " + value);
        
        
        System.out.println(map.toString());
        // {scott=1004, Tiger=1007} 재정의
        
        // 응용 ( 이해 )
        Set set = map.keySet(); // Key 집합 >> 규칙 : 순서x, 중복x Set
        Iterator it = set.iterator(); // 순차적인 출력
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        
        Collection clist = map.values();
        System.out.println(clist);
        
        // Map 하고 List 혼합
        // HashMap<String,List> room = new  HashMap<String,List>();
        // room.add("1",new ArrayList())
        
        
        
    }

}
