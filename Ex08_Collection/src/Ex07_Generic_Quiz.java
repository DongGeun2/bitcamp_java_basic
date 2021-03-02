import java.util.ArrayList;
import java.util.Stack;

import kr.or.bit.Coin;

class Product{
    int price;
    int bonuspoint;
    //Product() {   }
    Product(int price) {
         this.price = price;
         this.bonuspoint = (int)(this.price / 10.0);
    }
}

class KtTv extends Product {
     KtTv(){
          super(500);
     }
     //KtTv(int price){ super(price);}
     
     @Override
     public String toString() {
         return "KtTv";
     }
}


class Audio extends Product {
    Audio(){
          super(100);
     }
 
     @Override
     public String toString() {
         return "Audio";
     }
}


class NoteBook extends Product {
    NoteBook(){
          super(150);
     }
 
     @Override
     public String toString() {
         return "NoteBook";
     }
}

public class Ex07_Generic_Quiz {

    public static void main(String[] args) {
        //1. Array  배열을 사용해서  cart 만들고 제품을 담으세요 (tv , audio , notebook)
        Product[] p = {new KtTv(), new Audio(), new NoteBook()};
        for(Product i : p) {
            System.out.println(i.toString());
        }
        
        System.out.println("-----------------");
        //2. ArrayList   를 사용해서  cart  만들고 제품을 담으세요
        ArrayList<Product> p2 = new ArrayList<Product>();
        p2.add(new KtTv());
        p2.add(new Audio());
        p2.add(new NoteBook());
        
        for(Product i : p2) {
            System.out.println(i.toString());
        }
        
        
        //동전케이스
        //stack
        Stack<Coin> coinbox = new Stack<Coin>();
        coinbox.add(new Coin(500));
        coinbox.add(new Coin(50));
        coinbox.add(new Coin(100));
        coinbox.add(new Coin(10));
        
        while(!coinbox.isEmpty()) {
            Coin coin = coinbox.pop();
            System.out.println("동전 : " + coin.getValue() + "원");
        }
        
        
        
        
        
        
    }
        
}