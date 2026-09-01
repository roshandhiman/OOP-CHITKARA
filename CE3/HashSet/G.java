import java.util.*;
public class G {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashSet<String> a=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        for(String str:a){
            System.out.print(str + " ");
        }
    }
    
}
