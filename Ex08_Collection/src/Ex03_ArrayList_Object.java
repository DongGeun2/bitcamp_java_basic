import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {
    public static void main(String[] args) {
        // 사원 1명을 만드세요
        Emp emp = new Emp(100,"김유신","군인");
        System.out.println(emp.toString());

        // 사원 2명을 만드세요
        // Array
        Emp[] emplist = {new Emp(100,"김씨","일반인"),new Emp(200,"박씨","학생")};
        for(Emp i : emplist) {
            System.out.println(i.toString());
        }
        // 1명 입사를 더했어요 추가해주세요. (기존)
        // Emp[] emplist = new Emp[3];
        // 기존 데이터 이동 ...
        
        // Collection 
        // ArrayList
        ArrayList elist = new ArrayList();
        elist.add(new Emp(1,"강","IT"));
        elist.add(new Emp(2,"김","IT"));
        // 1명 입사
        elist.add(new Emp(3,"이","IT"));
        System.out.println(elist.size());
        for(int i = 0; i < elist.size(); i++) {
            //System.out.println(elist.get(i));
            //Emp e = elist.get(i); ArrayList 가지고 있는 배열 타입 Object[] ...
            Object obj = elist.get(i);
            //System.out.println(obj); // 재정의 한 toString()
            Emp e = (Emp)obj;
            
        }
        System.out.println("------------------1");
        for(Object e : elist) {
            // 목적에 따라서는 downcasting
            Emp e2 = (Emp) e;

        }
        
        // 개발자가 제일 casting 예외
        // Object 쓰기 싫다
        // JAVA 만든 사람들에게 요청
        // generic 타입 (객체 생성 타입 강제)
        // 현업에서 90%가 generic 사용
        ArrayList<Emp> list2 = new ArrayList<Emp>();  // 타입 강제화 < > : generit
        list2.add(new Emp(100,"김","학생"));
        
        for(Emp i : list2) {
            System.out.println(i.getEmpno());
        }
        
        
        
    }
}
