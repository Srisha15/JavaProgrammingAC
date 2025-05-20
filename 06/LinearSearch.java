public class LinearSearch {

    public static int linearSearch(int numbers[], int key){

        //go through the complete array 
        for(int i = 0; i < numbers.length; i++){
            //check if number at ith position is equal to key
            if(numbers[i] == key){
                return i;  //return index 
            }
        }
        return -1; //if not found
    }

    public static int linearMenu(String menu[], String food){
        for(int i = 0; i < menu.length; i++){
            if(menu[i] == food){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,4,5,6,7,3,9};
        int key = 9;

        //Menu
        String menu[] = {"Dosa","Idly","Pasta","Sandwich","Oats"};
        String food = "Pasta";
        int foodIndex = linearMenu(menu, food);
        if(foodIndex == -1){
            System.out.println("Food Not Avaliable");
        }else{
            System.out.println("Food Avaliable at Index "+foodIndex);
        }

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Key not present in Array");
        } else{
            System.out.println("Key present at index "+index);
        }

    }
}
