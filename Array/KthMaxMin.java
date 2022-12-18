import java.util.Arrays;

public class KthMaxMin {
    static int[] maxMin(int ar[],int k,int n){
        Arrays.sort(ar);
        int[] minMax = {ar[k-1],ar[n-k]};
        return minMax;

    }
    public static void main(String args[]){
        int[] a = {1,6,34,2,5,7,8,5,3,2};
        int[] minMax = maxMin(a,2,10);
        System.out.println(minMax[0]+ " "+minMax[1]);
    }
}
