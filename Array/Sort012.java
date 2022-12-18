import java.util.Scanner;

public class Sort012 {
    static void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        while(i<=k){
            if(nums[i]==0){
                nums[i++] = nums[j];
                nums[j++]=0;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                nums[i] = nums[k];
                nums[k--] = 2;
            }
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        sortColors(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}