package kr.or.bit;
/*
 
 */
public class Airplane {
    private int airnum;
    private String airname;
    private static int airtotalcount;
    
    public void makeAirplane(int num, String name) {
        airnum = num;
        airname = name;   
        // 강제 누적 
        airtotalcount ++;
        AirPlaneInfo();
    }
    
    private void AirPlaneInfo() {
        System.out.println("비행기 이름 : " + airname + " , 번호 : " + airnum);
    }
    
    public void airPlaneTotalCount() {
        System.out.printf("비행기 누적 대수 : [%d]\n", airtotalcount);
    }
}
