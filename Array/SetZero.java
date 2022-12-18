import java.util.Scanner;

public class SetZero {
    static void setZeroes(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        int row[]=new int[n];
        int column[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || column[j]==1) matrix[i][j]=0;
            }
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j] = s.nextInt();
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                System.out.println(arr[i][j]);
    }
}
