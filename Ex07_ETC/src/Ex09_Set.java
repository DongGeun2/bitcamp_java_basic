import java.util.HashSet;
import java.util.Set;

// Set 인터페이스를 구현하는 클래스
// Set 원 안에 들어가세요 (순서 보장(x), 중복 허용(x) : 순서가 없고 중복을 허락하지 않는 데이터 집합 : set
// HashSet, TreeSet
public class Ex09_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2);
        
        bo2 = hs.add(1); // 중복값 없는 것을 보장
        System.out.println(bo2);
       
        System.out.println(hs); // [1, 100, 55]
        
        hs.add(2);
        System.out.println(hs); // 순서가 보장 되지 않는다.  [1, 2, 100, 55]
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("F");
        hs2.add("c");
        hs2.add("Z");
        hs2.add("A");
        hs2.add("A");
        hs2.add("A");
        
        System.out.println(hs2);
        
        String[] obj = {"A","B","C","D","D","A"};
        HashSet<String> hs3 = new HashSet<String>();
        for(int i = 0; i < obj.length; i ++) {
            hs3.add(obj[i]);
        }
        System.out.println(hs3);
        // Quiz
        // HashSet 을 1~45 난수 6개 넣으세요
        
        int[] number = new int[6];
        HashSet<Integer> num = new HashSet<Integer>();
        for(int i = 0; i < number.length; i++) {
            boolean t = num.add(number[i] + (int)(Math.random() * 45 + 1));
            if(t == false) {
                num.add(number[i] + (int)(Math.random() * 45 + 1));
            }
        }
        System.out.println(num);
        
        
        Set set2 = new HashSet();
        int index = 0;
        while(set2.size() < 6) {
            int num1 = (int)(Math.random() * 45 + 1);
            set2.add(num1);
        }
        System.out.println(set2);
        
        //////////////
        HashSet<String> set3 = new HashSet<String>();
        set3.add("AA");
        set3.add("DD");
        set3.add("ABC");
        set3.add("FFF");
        System.out.println(set3);
        
        while(!set3.iterator().hasNext()) {
            System.out.println(set3.iterator().next());  // Set 은 배열이 아니지만 순차적으로 데이터 출력 가능
        }
        
    }
}
