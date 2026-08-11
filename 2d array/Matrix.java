import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][2];
        int [][] b=new int [2][2];
        int [][] c=new int[a.length][b[0].length];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Now give value of matrix b");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                for(int k=0;k<b.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}
