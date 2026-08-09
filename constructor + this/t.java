import java.util.*;
class Timespan{
    int hours;
    int minutes;
    Timespan(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
    int getHours(){
        return hours;
    }
    int getMinutes(){
        return minutes;
    }
     public String toString(){
          return hours+"hours,"+minutes+"minutes" ;
    }
}
public class t {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Timespan t=new Timespan(sc.nextInt(), sc.nextInt());
        System.out.println(t.toString());
    }
    
}
