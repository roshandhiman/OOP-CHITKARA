class Visitor{
    static int count=0;
    Visitor(){
        count++;
    }
    void show(){
        System.out.println(count);
    }
}
public class E {
    public static void main(String[] args) {
        Visitor v=new Visitor();
        Visitor v1=new Visitor();
        Visitor v2=new Visitor();
        v2.show();


        
    }
    
}
