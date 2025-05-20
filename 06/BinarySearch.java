public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        //2 pointers = start, end
        int start = 0;  //dont intialize to element --> index number
        int end = numbers.length - 1;

        while(start <= end){
            //1.calculate mid
            int mid = (start+end)/2;

            //2.Check with mid 
            if(numbers[mid] == key){
                return mid;
            } 
            if(mid > key){
                //serach first half / left half
                end = mid - 1; //start = 0 remains same
            } else{
                //earch second half/ right half
                start = mid + 1; //end = n-1 remains same
            }
        }
        return -1; //no key found


    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 18;
        int index = binarySearch(numbers, key);
        System.out.println("Key found at index "+index);
    }
}
