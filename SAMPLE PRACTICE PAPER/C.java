import java.util.*;
// interface Vehicle {
//     double fuelEfficiency(double distance, double fuelUsed);
// }
// class Car implements Vehicle {
//     public double fuelEfficiency(double distance, double fuelUsed) {
//         return distance / fuelUsed;
//     }
// }
// class Bike implements Vehicle {
//     public double fuelEfficiency(double distance, double fuelUsed) {
//         return distance / fuelUsed;
//     }
// }
// public class C {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice = sc.nextInt();
//         double distance = sc.nextDouble();
//         double fuelUsed = sc.nextDouble();
//         Vehicle v;
//         if (choice == 1) {
//             v = new Car();
//         } else {
//             v = new Bike();
//         }
//         double result = v.fuelEfficiency(distance, fuelUsed);
//         System.out.printf("%.2f", result);
//         sc.close();
//     }
    

// }



interface Vehicle {
    double fuelEfficiency(double distance, double fuelUsed);

}
class Car implements Vehicle{
   public double fuelEfficiency(double distance, double fuelUsed){
        return distance/fuelUsed;
    }
}

class Bike implements Vehicle{
   public double fuelEfficiency(double distance, double fuelUsed){
        return distance/fuelUsed;
    }
}

public class C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();

        double dist=sc.nextDouble();
        double fuel=sc.nextDouble();

        Vehicle v;
        if(c==1){
            v=new Bike();
        }else{
            v=new Car();

        }

        System.out.printf("%.2f",v.fuelEfficiency(dist, fuel));
    }
}