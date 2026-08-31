import java.util.*;
class InsufficentBalaceException extends Exception{
    InsufficentBalaceException(String message){
        super(message);
    }
}
public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            if(a<b){
                throw new InsufficentBalaceException("Insufficent Balance");
            }
            System.out.println(a-b);
        }catch(InsufficentBalaceException e){
            System.out.println(e.getMessage());
        }
    }
}
