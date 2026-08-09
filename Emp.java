import java.util.*;;
class Employee{
    String name;
    int salary;
    void display(){
        System.out.println(name);
        System.out.println(salary);
    }

}
public class Emp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        e.name=sc.next();
        e.salary=sc.nextInt();
        e.display();
    }
}
