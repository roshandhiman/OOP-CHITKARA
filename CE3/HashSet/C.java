import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(!a.add(num)){
                 System.out.println("Duplicate Found");
                 return;
            }
        }
        System.out.println("No Duplicate");
    }
    
}
