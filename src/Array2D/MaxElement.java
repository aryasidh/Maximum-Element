package Array2D;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of row 2d array "+" ");
        int m=sc.nextInt();
        System.out.print("enter the size of column 2d array "+" ");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("enter element");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                mx=Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
