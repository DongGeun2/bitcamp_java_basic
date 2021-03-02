import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/*
 Collection FrameWork
 표준화
 [나열된 자원에 대해서 순차적으로 접근해서 값을 리턴하는 것에 대해서 표준화] >> 인터페이스를 설계
 
 Iterator 인터페이스
 >> hasNext(), Next(), remove() 추상함수
 >> 구현 : ArrayList >> iterator 구현
 
 public Iterator iterator(){
     return new A implements Iterator;
 }
 
 
 */
public class Ex08_Collection_iterator {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        
        // 출력
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        // iterator
        // 표준화된 출력 방식(나열된 자원에 대해서)
        Iterator it = list.iterator();
        // ArrayList 가 Collection 인터페이스가 가지고 있는 추상함수 구현
        // public Iterator iterator(); >> 구현
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(10);
        intlist.add(20);
        intlist.add(30);
        
        Iterator<Integer> it2 = intlist.iterator();
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
        
        System.out.println("---------------------");
        
        // Iterator 인터페이스
        // 역방향 조회 ( 조건 : 순방향 -> 다시 역방향 )
        ListIterator<Integer> it3 = intlist.listIterator();
        
        // 순방향
        
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
        
        // 역방향
        while(it3.hasPrevious()) {
            System.out.println(it3.previous());
        }
        
        
        
        
    }

}
