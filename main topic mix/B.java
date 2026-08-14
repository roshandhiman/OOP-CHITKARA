import java.util.*;
class Book{
    String title;
    int price;
    Book(){
        title="Unkown";
        price=0;
    }
    Book(String title,int price){
        this.title=title;
        this.price=price;
    }
    void show(){
        System.out.println("Title : " + title);
        System.out.println("Price : "+price);
    }
}

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book b =new Book();
        Book b1=new Book(sc.next(),sc.nextInt());
        b.show();
        b1.show();
        sc.close();
    }
    
}
