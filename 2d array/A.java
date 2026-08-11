import java.util.*;;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[2][2];
        int sum=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }   
        System.out.println(sum);
        System.err.println("*********************");
        int max=a[0][0];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("MAximum in the list is : " + max);
        
        
    }
    
}
