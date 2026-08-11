import java.util.*;
abstract class shape{
    abstract double area();   
}
class Circle extends shape{
    int radius;
    Circle(int r){
        radius=r;
    }
    @Override
    double area(){
        return 3.14 * radius * radius;
    }
}
class Rectangle extends shape{
    int l;
    int b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    double area(){
        return l*b;
    }
}
public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        shape s;
        if(c==1){
            s=new Circle(sc.nextInt());
        }
        else{
            s=new Rectangle(sc.nextInt(), sc.nextInt());
        }
        System.out.println(s.area());
    }
    
}
