import java.util.HashSet;
import java.util.Iterator;

class Myclass{
    private int id;
    private String name;
    

    public Myclass(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mycalss [id=" + id + ", name=" + name + "]";
    }

    public void displayInfo() {
        System.out.println("학번 : " + this.id);
        System.out.println("이름 : " + this.name);
    }
}






public class Ex10_Set_Object {

    public static void main(String[] args) {
        HashSet<Myclass> hset = new HashSet<Myclass>();
        hset.add(new Myclass(1,"ABC"));
        hset.add(new Myclass(2,"DEF"));
        hset.add(new Myclass(3,"AASD"));
        
        for(Myclass m : hset) {
            m.displayInfo();
        }
        
        // iterator
        Iterator<Myclass> itr =  hset.iterator();
        while(itr.hasNext()) {
            //itr.next().displayInfo();
            Myclass mc = itr.next();
        }
    }

}
