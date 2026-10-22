
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {

        for (int j = 0; j < n; j++) {

            arr[i][j] = sc.nextInt();

        }}
      int ps=0;
      int ss=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==j){
                  ps+=arr[i][j];
              }
              if(i+j==n-1){
                  ss+=arr[i][j];
              }
          }
      }
      int p=Math.abs(ps-ss);
      System.out.print(p);
    }
		
	
}
