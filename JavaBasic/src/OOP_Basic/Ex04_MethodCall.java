package OOP_Basic;

import kr.or.bit.Car;
import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex04_MethodCall {

    public static void main(String[] args) {
        NoteBook notebook = new NoteBook();
        notebook.setColor("red");
        notebook.setYear(-2000);
        
        
        System.out.println(notebook.getColor());
        System.out.println(notebook.getYear());
        
        Mouse mouse = new Mouse();
        notebook.handle(mouse);
        System.out.println(mouse.x);
        System.out.println(mouse.y);
        
        
        // notebook 3대 생성하고
        // 2000 red
        // 2010 blue
        // 2020 white
        // 명시하고 정보를 출력하세요.
        
        // * TODAY POINT
        // * [[ 객체배열은 [방의 생성]과 [객체 생성] 2번 작업한다 ]] *

        //배열의 notebook 객체의 주소를 담을 수 있는 방 생성
        // 클래스 타입의 배열은 방을 만드는 작업이기 때문에
        // 방을 만드는 작업과 객체를 생성하는 작업 2번 해야한다. 
        // 아래는 그 방법 3가지이다.
        
        // 1. 방법
        NoteBook[] note = new NoteBook[3];
        note[0] = new NoteBook();
        note[1] = new NoteBook();
        note[2] = new NoteBook();
        
        note[0].setColor("red");
        note[0].setYear(2000);
        
        note[1].setColor("blue");
        note[1].setYear(2010);
        
        note[2].setColor("white");
        note[2].setYear(2020);
        
        for(int i = 0;i < note.length; i++) {
            note[i].noteBookInfo();
        }
        // 개선되 for 문
        for(NoteBook i : note) {
            i.noteBookInfo();
        }
        
        // 2. 작업을 줄일수 없을까?
        // int[] arr = new int[]{1, 2, 3}
        NoteBook[] note2 = 
                new NoteBook[] {new NoteBook(), new NoteBook(), new NoteBook()};
        
        // 3. 사용빈도가 제일 높음
        // int[] arr = {1,2,3}
        NoteBook[] note3 = {new NoteBook(), new NoteBook(), new NoteBook()};
        
        
        
        
        // ---------------------------
        Car[] car = {new Car(), new Car(), new Car()};
        car[0].SetWindow(4);
        car[0].SetSpeed(-10);
        car[0].carInfo();
        car[0].speedUP();

    }


}
