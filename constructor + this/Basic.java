class Emp{
    String name;
    int age;
    Emp(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name +" "+ age);
    }
}
public class Basic {
    public static void main(String[] args) {
        Emp e= new Emp("Roshan",18);
        e.display();
    }
    
}
