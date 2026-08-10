class Studen{
    String name;
    int roll;
    static String college="Chitkara";
    Studen(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void show(){
        System.out.println(name +" "+ roll+ " "+ college);
    }

}
public class C {
    public static void main(String[] args) {
        Studen s=new Studen("rosan", 311);
        s.show();
    }
    
}
