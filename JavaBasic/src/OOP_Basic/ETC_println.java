package OOP_Basic;
// println 의 원리.


class print {
    void add(int i) {
        System.out.println(i);
    };

    void add(String s) {
        System.out.println(s);
    }
}

class Ssystem {
    public static final print out;
    static {
        out = new print();
    }
}

public class ETC_println {

    public static void main(String[] args) {
        Ssystem.out.add(100);
    }
}
