import java.util.*;
class Student{
    String name;
    int age;
    void show(){
        System.out.println(name);
        System.out.println(age);
    }

}
public class St {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        Student s=new Student();
        s.name=name;
        s.age=age;
        s.show();

        
    }
}
