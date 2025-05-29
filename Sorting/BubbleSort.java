public class BubbleSort {

    public static void printArray(int[] arr){
            for(int k =0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        }
    public static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int a = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = a;
                }

            }
            printArray(arr);
        }
        for(int k =0; k < arr.length; k++){
            System.out.print(arr[k]+",");
        }
    }

    public static void bubbleSortSC(int[] arr){
        for(int turn = 0; turn < arr.length; turn++){
            for(int j = 0; j < arr.length -1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,-4,1,3,2};
        bubbleSort(arr);
    }
}


