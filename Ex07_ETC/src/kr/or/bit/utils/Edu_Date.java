package kr.or.bit.utils;

import java.util.Calendar;

// 날짜의 형식을 제공하는 설계도
// 많이 사용 >> 편하게 >> 기능이 자주 사용하게 된다면 Static 함수 >> 하나의 이름으로 Overloading

public class Edu_Date {
    public static String DateString(Calendar date) {
        return  date.get(Calendar.YEAR) + "년" +
               (date.get(Calendar.MONTH)+1) + "월" +
                date.get(Calendar.DATE) + "일";
    }
    public static String DateString(Calendar date,String opr) {
        return  date.get(Calendar.YEAR) + opr +
               (date.get(Calendar.MONTH)+1) + opr +
                date.get(Calendar.DATE);
    }
    // 요구사항
    // 2021년2월17일
    // 1~9월 >> 01, 02 ....
    // 10 11 12 >> 그대로 출력
    
    public static String monthFormat_DateString(Calendar date) {
        String month_Date = "" + (date.get(Calendar.MONTH)+1) ;

        if(date.get(Calendar.MONTH) < 10){
            month_Date = "0" + (date.get(Calendar.MONTH)+1) ;
        }
        return  date.get(Calendar.YEAR) + "년" +
        month_Date + "월" +
         date.get(Calendar.DATE) + "일";
    }
    
    
    
}
