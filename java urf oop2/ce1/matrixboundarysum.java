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
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0|| i==m-1 || j==0 || j==n-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);

    }
		
	
}