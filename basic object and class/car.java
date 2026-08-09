import java.util.*;
class Carr{
    String name;
    int speed;
    void show(){
        System.out.println(name);
        System.out.println(speed);
    }
}
public class car {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    
    Carr c1=new Carr();
    Carr c2=new Carr();
    c1.name=sc.next();
    c1.speed=sc.nextInt();
    c2.name=sc.next();
    c2.speed=sc.nextInt();
    c1.show();
    c2.show();
    
}}
