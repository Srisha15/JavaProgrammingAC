public class MaxSubArraySumM2 {
        public static int maxSubarraySum(int arr[]){
        // int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;  //maxSum = -inf
        int prefix[] = new int[arr.length];
        int currentSum = 0;

        //cal prefix array
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;

                currentSum = start == 0 ? prefix[end]: prefix[end] - prefix[start - 1];
    
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                // System.out.println();
                // System.out.print("Sum = "+ currentSum);
                // System.out.println();

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
