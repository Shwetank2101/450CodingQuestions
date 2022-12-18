import java.util.Scanner;

public class KadansAlgorithm {
    static int maxSubArray(int[] nums) {
        int count=0;
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count+nums[i]>0){
                count+=nums[i];
                max=Math.max(count,max);
            }
            else count=0;
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
}
