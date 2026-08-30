package CE3.ArrayList;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i).equals(a.get(j))){
                    a.remove(j);
                    j--;
                }
            }
        }
        System.out.println(a);
    }
    
}
