import java.util.*;
class Student{
    String name;
    int age;
    int marks;
    Student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.print("Marks : "+marks);
    }
}
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student(sc.next(), sc.nextInt(), sc.nextInt());
        s.show();
        sc.close();
        
    }
    
}
