import java.util.Vector;

/*
 Collection FrameWork
 
 [다수의 데이터를] 다루는 [표준화된 인터페이스]를 [구현하고 있는 클래스의 집합]
 
 Collection 인터페이스 -> List 인터페이스 상속 -> ArrayList(구현 : 수많은 약속을)
                     -> Set 인터페이스 상속 -> HashSet, TreeSet( 구현 )
                     
 Map 인터페이스 (key, value) -> HashMap(구현)
 
 1. List ( 줄을 선다 : 번호표 ) : 순서를 보장, 중복 허용  >> 내부적으로 데이터(자료, 객체) >> *[배열]로 관리
    >> 예) [홍길동][홍길동][홍길동]
 구현하고 있는 클래스
   1.1 Vector(구버전)            -> 동기화 보장(멀티 스레드) -> Lock(장치o) -> 성능이 떨어짐 -> 안전성 보장
   1.2 ArrayList(신버전)         -> 동기화 보장(멀티 스레드) -> Lock(장치x): 필요에 따라 사용가능 -> 성능을 우선시 -> 안전성 떨어짐
  ------------------------------------------
  * 기존의 여러개의 같은 타입의 데이터 관리 : Array 정적(고정)
  - 방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
  int[] arr = new int[5];
  [줄이거나 늘리는 작업 불가]
  int[] arr2 = new int[10];
  arr 자원을 arr2로 옮겨야 늘려서 사용가능 
   
  Array
  1. 배열의 크기 고정 : Car[] cars = {new Car(), new Car()}; // 방 2개
  2. 접근 방법 (index) 방 번호로 접근 : cars[0] .... cars[n] 방까지...
  3. 초기 설정 불가
  
  <-> Collection
  List > Vector, ArrayList
  1. 배열의 크기를 동적으로 확장 가능 : 축소도 가능 >> 프로그램적으론 말도 안되는 이야기 >> ** 사실은 [배열의 재할당] 이용 
  2. 순서를 유지(내부적으로 index 사용), 중복값 허용
  3. 데이터 저장 공간 : Array
   

 
 */
public class Ex01_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("초기 default : 용량 " + v.capacity()); // 10개 배열 
        System.out.println("size : " + v.size());
        
        v.add("AA");
        v.add("AA");
        v.add("AA");
        System.out.println("데이터 크기 : size : "+ v.size());
        System.out.println(v.toString()); // [AA, AA, AA]  // 재정의
        // Array : length
        // Collection : size
        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i)); // array[i] // 함수 get() 사용
        }
        
        // Vector는 object타입
        for(Object obj : v) {
            System.out.println(obj);
        }
        
        // <제너릭>  >> 타입을 강제 >> 추후 별도로 학습
        Vector<String> v2 = new Vector<String>();
        v2.add("hello");
        v2.add("world");
        v2.add("king");
        
        for(String str : v2) {
            System.out.println(str);
        }
         /////////////////////////////////////////
        
        Vector v3 = new Vector();
        System.out.println(v3.capacity());
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        System.out.println(v3.capacity()); // 20
        System.out.println(v3.size()); // 11
        
    }
    
}
