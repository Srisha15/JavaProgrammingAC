
public class InsertionSort {
    public static void printArray(int[] arr){
            for(int k =0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){

        //Outerloop -> previous to it = Sorted, itself and after it= Unsorted
        for(int i = 1; i < arr.length; i++){  // i = 0 -> sorted, i = 1 to len -> unsorted
            //to store current element value
            int cur = arr[i];
            //previous index
            int prev = i - 1;

            //finding out which space to insert the 1st element of unsorted 
            while(prev >= 0 && arr[prev] > cur){
                //Copy the prev element to next index
                arr[prev + 1] = arr[prev];
                //Decr prev
                prev--;

            }

            //Insertion
            arr[prev+1] = cur;
        }

        printArray(arr);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);

    }
}
