//1.
//BruteForce Approach  o(n^3) time complexity
public class MaxSubarraySum {
    public static int maxSubarraySum(int arr[]){
        // int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;  //maxSum = -inf

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                int currentSum = 0;
                for(int k = start; k <= end; k++){
                    //1.Calculate Sum
                    // currentSum += arr[k];
                    // System.out.println("Sum = "+ currentSum);
                    System.out.print(arr[k]+" ");
                    currentSum += arr[k];


                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                System.out.println();
                System.out.print("Sum = "+ currentSum);
                System.out.println();

                // System.out.println("Sum = "+ currentSum);


            }
            //System.out.println();
        }

        return  maxSum;
        //System.out.println(maxSum);



    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int maxSubarray = maxSubarraySum(arr);
        System.out.println("The max sum of the subarray is = "+maxSubarray);
    }
}
