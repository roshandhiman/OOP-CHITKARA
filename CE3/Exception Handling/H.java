import java.util.*;
class BookNotAvailableException extends Exception{
    BookNotAvailableException(String message){
        super(message);
    }
}
public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
            b.add(sc.nextInt());
        }
        int ind=-1;
        int copy=0;
        String book=sc.next();
        for(int i=0;i<n;i++){
            if(a.get(i).equals(book)){
                ind=i;
                break;
            }}
            try{
                if(ind == -1 || b.get(ind) == 0){
                    throw new BookNotAvailableException("Book not available: "+a.get(ind));
                }
            }
            catch(BookNotAvailableException e){
                System.out.println(e.getMessage());
                return;
            }
            if(b.get(ind)>0){
                copy=b.get(ind)-1;
            }
            System.out.println("issued: "+book);
            System.out.println("copies remaining: "+copy);
        

    }
    
}
