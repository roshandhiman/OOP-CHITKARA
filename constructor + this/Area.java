import java.util.*;
class Rectangle{
    int width;
    int length;
    Rectangle(int width,int length){
        this.length=length;
        this.width=width;
    }
    void show(){
        System.out.println(length*width);
    }


}
public class Area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle r=new Rectangle(sc.nextInt(),sc.nextInt());
        r.show();
        sc.close();
    }
    
}
