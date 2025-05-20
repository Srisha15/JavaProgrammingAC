public class Pairs {
    public static void pairArray(int[] arr){
        int tp =0; //Keep track of number of pairs
        //Outer loop -> 1st element in pair
        for(int i = 0; i < arr.length; i++){
            //Inner loop -> 2nd element corr to 1st ele in pair
            for(int j = i+1; j < arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
          System.out.println();
        }
        System.err.println("Total number of pairs: "+tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairArray(arr);
        
    }
}
