import java.util.*;
public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        TreeSet<Integer> b=new TreeSet<>(a);
        for(int i=1;i<=b.size();i++){
            if(!b.contains(i)){
                System.out.println("Mising number : " + i);
            }
        }
    }
    
}
