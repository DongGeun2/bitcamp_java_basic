package day0119;
// 이름, 나이, 국어, 영어, 수학
// 총점, 평균, 졸업여부 에 해당하는
// 변수를 각각 만들어주고
// 해당 변수들을 올바른 값으로 초기화해서
// 전부다 출력하는 프로그램을 작성하세요

public class Ex08GradeBook {
    public static void main(String[] args) {
        String name = "이동근";
        int age = 27;
        int k = 100;
        int e = 90;
        int m = 80;
        int sum = k + e + m;
        double average = sum / 3.0;
        boolean graduation = true;
        
        System.out.println("이름: " + name + " 나이: " + age);
        System.out.println("국어: " + k + " 영어: " + e + " 수학: " + m);
        System.out.println("총점: " + sum + " 평균: " + average + " 졸업여부: " + graduation);

        
        
           
       
    }
}
