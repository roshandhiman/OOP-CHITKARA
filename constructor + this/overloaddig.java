class Book{
    String name;
    int price;
    Book(){
        name="unknown";
        price=0;
    }
    Book(String name,int price){
        this.name=name;
        this.price=price;
    }
    void show(){
        System.out.println(name+" "+ price);
    }
}
public class overloaddig {
    public static void main(String[] args) {
        Book b=new Book();
        Book b1=new Book("ABC",999);
        b.show();
        b1.show();
    }
    
}
