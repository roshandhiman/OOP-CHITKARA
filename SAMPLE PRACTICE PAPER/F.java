class Employee{
    int salary;
    Employee(int salary){
        this.salary=salary;
    }
    void show(){
        System.out.println(salary);
    }
}
class Manager extends Employee{
    Manager(int salary){
        super(salary);
    }
    @Override
    void show(){
        int a=salary+5000;
        System.out.println(a);
    }
}
class Developer extends Employee{
    int projects;
    Developer(int salary,int projects){
        super(salary);
        this.projects=projects;
    }
    @Override
    void show(){
        int a=salary+(2000*projects);
        System.out.println(a);
    }
}
public class F {
    
}
