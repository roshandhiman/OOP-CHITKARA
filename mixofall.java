import java.util.*;
public class mixofall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String str="aeiroshanou";
        // // String a="I AM ROSHAN";
        // // String b="";
        // // for (int i=0;i<a.length();i++){
        // //     if(a.charAt(i)!=' '){
        // //         b+=a.charAt(i);
        // //     }
        // // }
        // // System.out.print(b);
        // StringBuilder s=new StringBuilder(str);

        // // for(int i=0;i<str.length();i++){
        // //     if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        // //         str=str.replace(str.charAt(i),'*');
        // //     }
        // // }
        // // // System.out.print(s);
        // // System.out.println(str);
        // // //str.replce('a','b')


        // s.insert(3,'a');
        // System.out.print(s);




        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int [r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
