import java.util.*;
class Rect{
    int len;
    int wid;
    void area(){
        int area=len*wid;
        System.out.print("Area of rectangle is : "+area);
    }

}
public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        Rect r = new Rect();
        r.len=l;
        r.wid=w;
        r.area();

        
    }
    
}
