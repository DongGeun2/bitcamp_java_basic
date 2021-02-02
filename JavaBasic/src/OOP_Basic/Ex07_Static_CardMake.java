package OOP_Basic;

import kr.or.bit.Card;

public class Ex07_Static_CardMake {

    public static void main(String[] args) {
        // card 53장
        // heap (객체)
        Card c = new Card();
        c.num = 1;
        c.kind = "heart";
        //c.h = 80;    53 각각....
        //c.w = 50; 
        c.h = 80;
        c.w = 50;
        c.cardInfo();
        
        Card c1 = new Card();
        c1.num = 2;
        c1.kind = "heart";
        c1.cardInfo();
        
        // 고객... 변심... 카드가 작아요..
        // 현실세계 53인쇄....
        
        // h = 80 , w = 50 요구사항 (반영)
        // 프로그램 세계
        // 1. 53장 카드 h, w 일일히 변경.
        
        // 2. 설계도 변경 (다시 인쇄)
        
        
        
    }

}
