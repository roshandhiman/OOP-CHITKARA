class Student{
    String name;
    static String college="chitkara";
    void show(){
        System.out.println(name +" "+college);
    }
}

public class Basic {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        s1.name="Roshna";
        s.name="Roshanpreet";
        s.show();
        s1.show();

    }
    
}
