public class SumOfSubarrays {
    public static void sumOfSubarrays(int arr[]){
        // int sum = 0;
        for(int i = 0; i < arr.length; i++){
            // int start = i;
            for(int j = i; j < arr.length; j++){
                // int end = j;
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                   
                    sum +=arr[k];
                    // System.out.println("sum = "+sum);
                }
                System.out.println();
                System.out.println("sum = "+sum);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        sumOfSubarrays(numbers);
    }
}
