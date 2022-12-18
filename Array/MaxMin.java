public class MaxMin {
    static int[] minAndMax(int arr[],int n){
        int[] minMax = {1000000,-1000000};
        for(int i=0;i<n;i++){
            if(minMax[0]>arr[i]){
                minMax[0] = arr[i];
            }
            if(minMax[0]<arr[i]){
                minMax[1] = arr[i];
            }
        }
        return minMax;

    }
    public static void main(String args[]){
        int[] arr = {5,1,3,5,7,9,4,2,5,7};
        System.out.println(minAndMax(arr,10)[0]+" "+minAndMax(arr,10)[1]);
    }
}