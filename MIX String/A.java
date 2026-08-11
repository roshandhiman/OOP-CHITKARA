import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        // String b="";
        // for(int i=a.length()-1;i>=0;i--){
        //     b+=a.charAt(i);
        // } 
        // System.out.println(b);
        // if(a.equals(b)){
        //     System.out.println("Plaindrome ");
        // }
        // else{
        //     System.out.println("NOt");
        
        // }
        // sc.close();
        // String b="";
        // for(int i=0;i<a.length();i++){
        //     if(a.charAt(i)!=' '){
        //         b+=a.charAt(i);
        //     }
        // }
        // System.out.println(b);
        // System.out.println(a.replaceAll(" ", ""));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                sb.append('*');
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }
}
