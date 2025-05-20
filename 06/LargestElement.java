public class LargestElement {
    public static int largestElement(int numbers[]){
            int max = Integer.MIN_VALUE; // max = -infinity -- smallest value
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
        

    }

    public static int smallestElement(int numbers[]){
        int min = Integer.MAX_VALUE; //min = +infinity
        for(int i = 0; i < numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
    public static int index(int numbers[],int key){
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,2,4,6,1,120,100};
        int max = largestElement(numbers);
        int min = smallestElement(numbers);
        System.out.println("Largest value is "+max);
        System.out.println("Largest value lies in index "+index(numbers, max));
        System.out.println("Smallest value is "+min);
        System.out.println("Largest value lies in index "+index(numbers, min));
    }
}
