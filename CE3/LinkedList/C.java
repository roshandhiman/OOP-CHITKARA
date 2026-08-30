import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        ArrayList <String> b= new ArrayList<>();
        for(String num : a){
            String word=num.toLowerCase();
            String rev=new StringBuilder(num).reverse().toString();
            if(num.equals(rev)){
                b.add(num);
            }
        }
        if(b.isEmpty()) {
            System.out.println("No Palindrome");
            return;
        }
        for(String num:b){
            System.out.print(num +" ");
        }
    }
}
