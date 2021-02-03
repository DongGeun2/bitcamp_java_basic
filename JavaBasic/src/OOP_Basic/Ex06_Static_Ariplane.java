package OOP_Basic;

import kr.or.bit.Airplane;

public class Ex06_Static_Ariplane {

    public static void main(String[] args) {
       /*
        Airplane air = new Airplane();
        air.makeAirplane(707, "대한");
        
        Airplane air2 = new Airplane();
        air2.makeAirplane(708, "대한");
        
        air2.airPlaneTotalCount();
        
        Airplane air3 = new Airplane();
        air3.makeAirplane(709, "대한");
        
        air2.airPlaneTotalCount();
        */
        
        Airplane airplane = new Airplane("대한", 707);
        airplane.AirPlaneInfo();
        airplane.airPlaneTotalCount();
        
        Airplane airplane2 = new Airplane("대한", 808);
        airplane2.AirPlaneInfo();
        airplane.airPlaneTotalCount();
        
    }

}
