import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> a= new HashSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        List<Integer> b=new ArrayList<>(a);
        Collections.sort(b);
        for(Integer num:b){
            System.out.print(num+ " ");
        }
    }
    
}
