class Emp{
    String name;
    double salary;
    Emp(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    double calculateBonus(){
        return salary * 0.05;
    }
    void show(){
        System.out.println(name +" "+ salary);
    }
}
class Manager extends Emp{
    Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    double calculateBonus(){
        return salary *0.10;
    }
}
class Developer extends Emp{
    Developer(String name, double salary) {
        super(name, salary);
    }
    @Override
    double calculateBonus(){
        return salary *0.08;
    }
}
public class F {
    

    public static void main(String[] args) {
        Emp e1 = new Manager("Alice", 80000);
        Emp e2 = new Developer("Bob", 60000);
        e1.show();
        System.out.println("Bonus: " + e1.calculateBonus());
        System.out.println();
        e2.show();
        System.out.println("Bonus: " + e2.calculateBonus());
    }

}

