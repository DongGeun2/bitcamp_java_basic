import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

    public static void main(String[] args) {
        // Set 인터페이스 : 순서를 보장하지 않고 중복을 허용하지 않는다.
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("B");
        hs.add("A");
        hs.add("F");
        hs.add("K");
        hs.add("G");
        hs.add("D");
        hs.add("P");
        hs.add("A");
        hs.add("C");
        System.out.println(hs); 
        //[P, A, B, C, D, F, G, K]
        
        // TreeSet
        // 순서(x) 중복허용(x) >> 정렬 (o)
        // 검색하거나 정렬을 필요로 하는 자료구조(데이터 집합)
        
        // 1. 2진 트리구조
        // 2. 데이터가 저장될 때 정렬된다
        // 로또 ......
        Set<Integer> lotto = new TreeSet<Integer>();
        for(int i = 0; lotto.size() < 6; i++) {
            lotto.add((int)(Math.random() * 45 + 1)); 
        }
        
        System.out.println(lotto);
    }

}
