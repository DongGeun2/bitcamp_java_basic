package kr.or.bit;
/*
 비행기 누적 개수 구하기. static
 */

// this - 생성자를 활용하여 코드 개선하기(리펙토링)
public class Airplane {
    private int airnum;
    private String airname;
    private static int airtotalcount;
    
    public Airplane(String airname, int airnum) {
        this.airname = airname;
        this.airnum = airnum;
        airtotalcount ++;
    }
    
    public void AirPlaneInfo() {
        System.out.println("비행기 이름 : " + this.airname + " , 번호 : " + this.airnum);
    }
    
    public void airPlaneTotalCount() {
        System.out.printf("비행기 누적 대수 : [%d]\n", airtotalcount);
    }
}
