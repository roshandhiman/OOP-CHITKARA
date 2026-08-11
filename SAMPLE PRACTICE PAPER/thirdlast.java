import java.util.*;;
interface Vechile{
    void start();
    void stop();
}
class car implements Vechile{
    public void start(){
        System.out.println("Car Started ");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
class bike implements Vechile{
    public void start(){
        System.out.println("Bike Started ");
    }
    public void stop(){
        System.out.println("Bike Stopped");
    }
}
public class thirdlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        Vechile v;
        if(a.equals("car")){
            v=new car();
        }
        else{
            v=new bike();
        }
        v.start();
        v.stop();
        
    }
    
}
