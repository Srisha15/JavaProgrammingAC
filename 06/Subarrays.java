public class Subarrays {

    public static void subArrays(int[] arr){
        int ts = 0;
        //outerloop -> Start Element
        for(int i = 0; i < arr.length; i++){
            int start = i;
            //Innerloop -> End element
            for(int j = i; j < arr.length; j++){
                int end = j;
                //Print numbers between them i.e Subarrays --> prints one subarray
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number of Subarrays "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subArrays(numbers);
        
    }
}
