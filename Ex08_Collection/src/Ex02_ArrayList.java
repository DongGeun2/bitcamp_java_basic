import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  Today Point
public class Ex02_ArrayList {

    public static void main(String[] args) {
        // List 인터페이스 구현 : 순서가 있는 중복 데이터를 허용하는 데이터 집합을 다룰 때 사용하는 클래스
        
        ArrayList arraylist = new ArrayList();
        // Object 타입을 가지는 정적배열 heap에 생성
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        for(int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        
        System.out.println(arraylist.toString());
        
        System.out.println(arraylist.get(0));
        
        // 순차적인 데이터를 다루는 것에 대한 장단점
        // 비순차적인 데이터 추가, 삭제 >> ArrayList는 비효율적 >> 순서가 있는 데이터 집합은 효율적
        // [100, 200, 300] >> 
        arraylist.add(0, 111);
        System.out.println(arraylist); // >> [111, 100, 200, 300] 덮는것이 아니고 뒤로 미룸.
        arraylist.add(400);
        System.out.println(arraylist); // 순차적으로 붙임
        
        //arraylist.remove(100); // java.lang.IndexOutOfBoundsException: Index 100 out of bounds
        
        // [111, 100, 200, 300, 400] arraylist
        // ArrayList 함수 공부 (String 함수 학습)
        System.out.println(arraylist.contains(200)); // true
        System.out.println(arraylist.contains(2000)); // false
        
        arraylist.clear(); // 데이터만 삭제 (공간은 유지)
        System.out.println(arraylist.size());
        System.out.println(arraylist.isEmpty()); // true  (값이 비어있는지 확인)
        
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        
        System.out.println(arraylist.isEmpty()); // false
        System.out.println("삭제 전 : " + arraylist.size()); // size 3
        Object value = arraylist.remove(0); // 0번째 방의 값을 삭제하고 그값을 return
        System.out.println("value : " + value);
        System.out.println("삭제 후 : " + arraylist.size());
        System.out.println(arraylist.toString());
        
        // Point
        // 개발자가 쓰는 코드 ... 일상다반사
        // 다형성을 좋아한다(확장성, 유연성)
        List li = new ArrayList();
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라");
        
        List li2 = li.subList(0, 2); // subList를 통해서 데이터 집합 생성
        System.out.println(li2.toString());
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        
        System.out.println(alist.toString()); // [50, 1, 7, 40, 46, 3, 15]
        Collections.sort(alist);  // 초급자는 sort 버블정렬 (x) 
        System.out.println(alist); // [1, 3, 7, 15, 40, 46, 50]
        
        Collections.reverse(alist);
        System.out.println(alist);
        
    }

}
