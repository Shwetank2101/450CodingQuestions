public class ReverseAnArray{
    static void reverse(int ar[],int n){
        for(int i=0;i<n/2;i++){
            int temp = ar[n-i-1];
            ar[n-i-1] = ar[i];
            ar[i] = temp;

        }
    }
    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]){
        int ar[] = {0,1,2,3,4};
        reverse(ar,5);
        printArray(ar,5);

    }
}