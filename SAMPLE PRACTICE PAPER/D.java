import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char b = sc.next().charAt(0);
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b){
                c++;
            }
        }
        System.out.println(c);
        
    }
    
}
