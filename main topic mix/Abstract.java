abstract class Empp {
    String name;
    int id;
    Empp(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    void displayDetails() {
        System.out.println(name + " " + id);
    }
}

class FullTimeEmp extends Empp {
    int monthlySalary;
    FullTimeEmp(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmp extends Empp {
    int hours;
    int rate;
    PartTimeEmp(String name, int id, int hours, int rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    double calculateSalary() {
        return hours * rate;
    }
}
public class Abstract {
    public static void main(String[] args) {
        Empp e1 = new FullTimeEmp("Roshan", 101, 50000);
        Empp e2 = new PartTimeEmp("Rahul", 102, 80, 400);
        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        System.out.println();
        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}