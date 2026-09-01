import java.util.*;
class InvalidMarksException extends Exception{
    InvalidMarksException(String msg){
        super(msg);
    }
}
public class J {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            try{
                if(val<0 || val >100){
                    throw new InvalidMarksException("Invalid Marks: "+val);
                }
                a.add(val);
            }
            catch(InvalidMarksException e){
                System.out.println(e.getMessage());
            }
        }
        int sum=0;
        for(Integer num : a){
            sum+=num;
        }
        double avg=(double)sum/a.size();
        System.out.println("Highest: "+Collections.max(a));
        System.out.printf("Average: %.2f%n", avg);

    }
    
}
