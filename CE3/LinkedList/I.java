import java.util.*;
public class I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        for(String s:a){
            String rev=new StringBuilder(s).reverse().toString();
            System.out.print(rev+" ");
        }
    }
}
