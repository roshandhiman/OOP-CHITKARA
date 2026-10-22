
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    int[][] arr = new int[m][n];

    for (int i = 0; i < m; i++) {

        for (int j = 0; j < n; j++) {

            arr[i][j] = sc.nextInt();

        }}
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
		
	
}
