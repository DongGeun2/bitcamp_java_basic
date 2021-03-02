
public class Ex06_String_Function {
    public static void main(String[] args) {
        // 일상적으로 다루는 데이터 : 문자열, 숫자, 날짜 >> 함수(시스템 함수)
        String str = "hello";
        String concatstr = str.concat(" world"); // 문자열 합치기
        System.out.println(concatstr); 
        
        boolean bo = str.contains("ello"); // 포함문자 찾기
        System.out.println(bo);
        
        boolean bo2 = str.contains("elo");
        System.out.println(bo2);
        
        
        String str2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
        System.out.println(str2.length());
        
        
        String filename = "hello java world";
        System.out.println(filename.indexOf("j")); // indexOf 는 해당 글자가 몇번째 자리에 있는지 표시.
        System.out.println(filename.indexOf("java"));
        System.out.println(filename.indexOf("개폭망")); // *** 배열에서 값이 없다는 return을 -1로 표현.
        // 신문사설에서 단어,문자가 포함되어있는지 확인하고싶을때
        // return 값이 0보다 큰값이 나오면 최소 1개 사설
        // -1이 나오면 해당 문자가 포함되어있지 않구나 확인.
        if(filename.indexOf("wo") != -1) {
            System.out.println("wo 하나라도 가지고 있구나.");
        }
        
        System.out.println(filename.lastIndexOf("a"));
        
        // length(), indexOf(), subString(), replace(), split()
        
        String result = "superman";
        System.out.println(result.substring(0)); // superman
        System.out.println(result.substring(2)); // perman
        System.out.println(result.substring(1,2)); // u  >> endindex -1 // 자기 자신이 출력
        System.out.println(result.substring(0,0)); // (0, -1)  >> 결과값 없음.
        System.out.println(result.substring(0,1)); 
        System.out.println(result.substring(2,3));
        
        // Quiz
        String filename2 = "h2.jpeg"; // 또는 파일명이 hong.png 또는 파일명이 h.tmp
        // 여기서 파일명과 확장자를 분리해서 화면에 출력하세요.
        // 1. 파일명 h
        // 2. 확장자 jpeg
        System.out.println("파일명 : " + filename2.substring(0,filename2.indexOf(".")));
        System.out.println("확장자 : " + filename2.substring(filename2.indexOf(".")+1));
        
        
        // replace ( 치환함수 )
        String str3 = "ABCEADDDDDDA";
        String result3 = str3.replace("DDDD", "오늘은 월요일");
        System.out.println(result3);
        
        result3 = str3.replace("A", "a");
        System.out.println(result3);
        
        
        // ETC
        System.out.println(str3.charAt(0)); // 해당위치 문자 호출
        System.out.println(str3.charAt(3));
        
        System.out.println(str3.endsWith("DDDDA")); // true
        System.out.println(str3.endsWith("BDDDA")); // false
        
        System.out.println(str3.equalsIgnoreCase("abcEADDDDDDA")); // 대소문자 구분하지 않는 euqals
        
        
        // TODAY POINT (split)
        /*
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
        String[] result5 = str4.split(",");
        for(String i : result5){
            System.out.println(i);
        }
        */
        
        String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
        String[] result5 = str4.split("\\."); // 자바가 \ 이스케이프 문자로 보기 때문에
        for(String s : result5){
            System.out.println(s);
        }
        // String[] java.lang.String.split(String regex)
        // 정규표현식 문법(표준화)
        // java, javascript, oracle, c# ) 모든언어에서 정규표현식을 도입.
        // 어떠한 문자를 만들때 [규칙]을 부여 >> 유효성에 대한 판단 근거
        // 주민번호 숫자6자리 - 숫자7자리 : {\d6}-{\d7}
        // 123-1234567 >> false - true
        // 핸드폰, 차량번호, 우편번호, 한글 처리, 도메인주소, 이메일 주소
        // 정규표현식은 이미 다 있다 ( 정규표현식에 대한 read 는 가능 해야한다 )
        
        
        
        
        // 정규표현식 
        //TIP) Java 특수문자
        //이스케이프 문자 >> 특정 문자 앞에 \
        char sing = '\''; 
        //char = sing = '\'';
        // 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 
        //System.out.println(sing);​
        //홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
        String ename = "홍\"길\"동";
        System.out.println(ename);

   
        // 넌센스
        String str6 ="홍         길         동";
        //"홍길동"
        // 저장 >> 공백제거해서 저장하길 원함
        System.out.println(str6.replace(" ", "")); // 홍길동
        
        String str7 = "            홍길동           ";
        System.out.println(str7);
        System.out.println(">" + str7.trim() + "<");    // trim : 양쪽 공백 제거
        
        String str8 = "      홍     길     동         ";
        String result6 = str8.trim();
        String result7 = result6.replace(" ", "");
        System.out.println(result7);
        
        // 자바에서 여러개의 함수를 적용 (method chain 기법 활용)
        System.out.println(str8.trim().replace(" ", "").substring(2));
        
       //Quiz -1
        int sum=0;
        String[] numarr = {"1","2","3","4","5"};
        // 문제 : 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
        for(String i : numarr) {
            sum += Integer.parseInt(i);
        }
        System.out.println(sum);
        
        //Quiz -2
        String jumin="123456-1234567";
        // 위 주민번호의 합을 구하세요.
        String[] numarr2 = jumin.replace("-","").split("");
        int sum3=0;
        for(String i : numarr2) {
            sum3+= Integer.parseInt(i);
        }
        System.out.println("주민번호 합2:" + sum3);
    }
}
