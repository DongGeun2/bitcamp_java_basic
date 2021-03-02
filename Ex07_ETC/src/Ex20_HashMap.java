/*
Java의 HashMap 클래스는 Map 인터페이스 기반의 구현 클래스입니다. 그리고 해쉬 테이블 자료 구조를 표현한 클래스입니다. 
앞에서 다루었던 HashSet 클래스도 해쉬 테이블 자료 구조를 표현한 클래스였습니다.
HashSet 클래스는 Collecion 인터페이스 기반의 구현 클래스로 단일 개체를 보관하는 클래스이며 HashMap 클래스는 key와 value를 쌍으로 보관하는 클래스입니다. 
보관할 때 key를 해쉬 테이블 내부의 해쉬 함수를 통해 보관하여 검색할 때 key로 검색하면 빠르게 value를 찾을 수 있는 장점을 갖고 있습니다.
HashMap 형식 변수 선언 및 개체 생성할 때는 제네릭 형식 인자로 키와 값을 명시하여 표현합니다.
HashMap<String, Book> book_dic = new HashMap<String, Book>();
보관할 때는 put 메서드를 사용할 수 있으며 키와 값을 입력 인자로 전달합니다.
book_dic.put(isbn, book);
그리고 보관하기 전에 같은 키 값을 갖는 요소가 있는지 판별할 때 containsKey 메서드를 이용할 수 있습니다. 이 때 검색 효율은 해쉬 테이블의 검색 속도입니다.

if(book_dic.containsKey(isbn)){
    System.out.println("이미 존재하는 ISBN입니다.");
    return;
}

삭제할 때도 remove 메서드에 키를 전달하여 삭제할 수 있습니다.

if(book_dic.containsKey(isbn)){
    book_dic.remove(isbn);
    System.out.println("삭제하였습니다."); 
}

else{
System.out.println("존재하지 않습니다."); 
}

특정 키를 갖는 값을 검색할 때 get 메서드를 사용합니다. 이 때 검색 또한 해쉬 테이블의 검색 속도입니다.
if(book_dic.containsKey(isbn)){
    Book book = book_dic.get(isbn);
    System.out.println("검색 결과>>"+book.toString());
    }else{
        System.out.println("존재하지 않습니다."); 
    }

모든 값 목록을 확인할 때는 values() 메서드의 반환 값을 이용할 수 있습니다.

    for(Book book : book_dic.values()){
    System.out.println(book.toString());
}

모든 키 목록을 확인할 때는 keySet 메서드의 반환 값을 이용할 수 있습니다.

for(String isbn : book_dic.keySet()){
    System.out.println(isbn);
}

다음 소스는 키를 도서의 ISBN, 값을 도서 개체로 관리하는 프로그램 예제입니다.

 
 */

import java.util.HashMap;
import java.util.Scanner;

//도서 클래스
class Book {
    final String isbn;
    String title;
    int price;

    public Book(String isbn, String title, int price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public String ISBN() {
        return isbn;
    }

    public String toString() {
        return String.format("ISBN:%s 이름:%s 가격:%d", isbn, title, price);
    }

}

//도서 관리자 클래스
class BookManager {
    Scanner scan = new Scanner(System.in);
    HashMap<String, Book> book_dic = new HashMap<String, Book>();

    public void Run() {
        int key = 0;
        while ((key = selectMenu()) != 0) {
            switch (key) {
            case 1:
                addBook();
                break;
            case 2:
                removeBook();
                break;
            case 3:
                searchBook();
                break;
            case 4:
                listBook();
                break;
            case 5:
                listISBN();
                break;
            default:
                System.out.println("잘못 선택하였습니다.");
                break;
            }
        }
        System.out.println("종료합니다...");
    }

    int selectMenu() {
        System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록0:종료");
        int key = scan.nextInt();
        scan.nextLine();
        return key;
    }

    void addBook() {
        String isbn;
        System.out.print("추가할 도서 ISBN:");
        isbn = scan.nextLine();
        if (book_dic.containsKey(isbn)) {
            System.out.println("이미 존재하는 ISBN입니다.");
            return;
        }

        String title;
        int price;
        System.out.print("도서 제목:");
        title = scan.nextLine();
        System.out.print("가격:");
        price = scan.nextInt();
        scan.nextLine();
        Book book = new Book(isbn, title, price);
        book_dic.put(isbn, book);
        System.out.println(book.toString() + " 생성하였습니다.");

    }

    void removeBook() {
        String isbn;
        System.out.print("삭제할 도서 ISBN:");
        isbn = scan.nextLine();
        if (book_dic.containsKey(isbn)) {
            book_dic.remove(isbn);
            System.out.println("삭제하였습니다.");
        }

        else {
            System.out.println("존재하지 않습니다.");
        }
    }

    void searchBook() {
        String isbn;
        System.out.print("검색할 도서 ISBN:");
        isbn = scan.nextLine();
        if (book_dic.containsKey(isbn)) {
            Book book = book_dic.get(isbn);
            System.out.println("검색 결과>>" + book.toString());
        } else {
            System.out.println("존재하지 않습니다.");
        }
    }

    void listBook() {
        System.out.println("도서 목록");
        int cnt = book_dic.size();
        System.out.println("도서 수:" + cnt);
        for (Book book : book_dic.values()) {
            System.out.println(book.toString());
        }

    }

    void listISBN() {
        System.out.println("ISBN 목록");
        int cnt = book_dic.size();
        System.out.println("도서 수:" + cnt);
        for (String isbn : book_dic.keySet()) {
            System.out.println(isbn);
        }
    }
}

//ISBN을 키로 도서 검색(HashMap 클래스 이용)

public class Ex20_HashMap {
    public static void main(String[] args) {
        BookManager bm = new BookManager();
        bm.Run();
    }

}
