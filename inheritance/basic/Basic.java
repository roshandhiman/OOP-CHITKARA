
class Person{
    String name;
    void introduce(){
        System.out.println("My name is Roshan");
    }
    }
    class Student extends Person{
        void study(){
            System.out.println("Student is Studying");
        }
    }


public class Basic {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="roshan";
        s.introduce();
        s.study();

    }
    
}
