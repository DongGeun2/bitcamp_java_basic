import java.util.ArrayList;

class Empdata{
    private String name;
    private int[] numbers;
    private ArrayList elist;
    
    Empdata(){
        this.name = "아무개";
        // 사용자 정의 타입, Array, ArrayList >> 초기화 >> 메모리를 갖는 것 >> new
        this.numbers = new int[10];
        this.elist = new ArrayList();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int[] getnumbers() {
        return this.numbers;
    }
    public void setnumbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    public ArrayList getElist() {
        return this.elist;
    }
    public void setElist(ArrayList elist) {
        this.elist = elist;
    }
    
    
}

public class Ex04_ArrayList {

    public static void main(String[] args) {
        Empdata e = new Empdata();
        System.out.println(e.toString());
        System.out.println(e.getElist().toString());
        
        ArrayList li = new ArrayList();
        li.add(100);
        li.add(200);
        
        
        e.setElist(li);
        System.out.println(e.getElist());
        
    }

}
