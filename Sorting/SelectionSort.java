

public class SelectionSort {
    public static void printArray(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int[] arr){
        //Outerloop - > Indicates the starting element
        //Previous to turns -> sorted array
        for(int i = 0; i <arr.length -1; i++){
            int minPos = i;
            //1.Find the smallest element from i to arr.length-1
            for(int j = i+1; j <= arr.length-1; j++){  //unsorted array

                //Smallest element
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //2. Swap the ith element with minPos
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);

    }
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        selectionSort(arr);
    }
}
