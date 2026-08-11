import java.util.*;
public class G {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        String reverse = sb.reverse().toString();
        System.out.println(s.equalsIgnoreCase(reverse));
    }
}
