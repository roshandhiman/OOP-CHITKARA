import java.util.*;;
public class D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int m=sc.nextInt();
        HashSet<Integer> b=new HashSet<>();
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        HashSet<Integer> common=new HashSet<>();
        for(Integer num:a){
            if(b.contains(num)){
                common.add(num);
            }
        }
        if(common.isEmpty()){
            System.out.println("There is no common value");
            return;
        }
        for(Integer val:common){
            System.out.print(val+" ");
        }
    }
    
}
