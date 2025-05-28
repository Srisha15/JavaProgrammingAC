public class KadaneAlg {
    public static int maxSumSub(int []arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }else{
                if(currSum > maxSum){   //maxSum = Math.max(currSum, MaxSum)
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int result = maxSumSub(arr);
        System.out.println("Max Value: "+result);
    }
}
