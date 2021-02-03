package OOP_Basic;
/*
생성자가 있는 설계도 만들기  QUIZ 입니다 아래 요구사항에 맞는 설계도를 만들어보세요
 
책은 책이름을 가지고 있고 가격을 가지고 있다 
책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다
책의 이름과 가격 정보는 특정 기능을 통해서만 볼수 있고 , 출판된 이후에서 수정할 수 없다  
  *책이름과 가격정보는 각각확인 할 수 있다.
*/

class Book{
    private String bookName;
    private int bookprice;
    

    public String getBookName() {
        return bookName;
    }

    public int getBookprice() {
        return bookprice;
    }

    // default (x) ... 강제
    // public Book(){} (x)
    public Book(String name, int price){
        bookName = name;
        bookprice = price;
    }
    
    public void bookInfo() {
        System.out.printf("책의이름: %s, 가격: %d원\n", bookName, bookprice);
    }
}

public class Ex18_Book {
    public static void main(String[] args) {
        Book book1 = new Book("개똥벌레",5000);
        book1.bookInfo();
        System.out.println(book1.getBookName());
        System.out.println(book1.getBookprice());
        
        Book book2 = new Book("자바란 무엇인가?", 10000);
        book2.bookInfo();
        
        Book book3 = new Book("비트컴퓨터" , 30000);
        book3.bookInfo();
    }
}
