public class ReverseArray {

    public static void reverseArray(int arr[]){  //space com = o(1), time = o(n)
        int first = 0;
        int last = arr.length - 1;
        int temp;

        while(first < last){
            //swap
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            //update
            first += 1;
            last -= 1;
        }
        System.out.println("The reversed Array is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");   
        }

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
        
    }
}
