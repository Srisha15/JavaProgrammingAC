import java.util.*;
public class CreationArray {
    static Scanner sc = new Scanner(System.in);  //use static keyword
    public static void createArrayM1(int n){
        int marks[] = new int[n];
        //array_name[index] = value;
        // marks[0] = 93;
        // marks[1] = 98;
        // marks[2] = 99;
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics: "+ marks[0]);
        System.out.println("Chemistry: "+ marks[1]);
        System.out.println("Maths: "+ marks[2]);


        //percentage
        int percentage = (marks[0] + marks[1] +marks[2])/n;
        System.out.println("Percentage = "+ percentage+"%");


        //update
        marks[2] = marks[2] + 1;  // marks[2] = 100;
        System.out.println("Updated Maths: "+ marks[2]);

    }

    public static void updateScience(int arr[], int notChangable){
        notChangable = 100;
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        //datatpye array_name[] = new datatype[size]; --> static; cannot be changed during runtime
        // int marks[] = new int[3];
        //new finds location in memory and allocates the size
        //initially empty --> actually stores 0 incase of dt of float/int; "" -> String; '' -> char
        //datatype array_name[] = {elements} 
        // String avengers[] = {"Iron Man","Captain America","Thor"};
       // Scanner sc = new Scanner(System.in); --> Avoid putting it here, function cant access put inside main class
        
       //What is length of an Array??
       String avengers[] = {"Iron Man","Captain America","Thor"};
       System.out.println("Length of Array "+avengers.length);

       System.out.println("Enter marks");
        //createArrayM1(3);
        sc.close();

        //Interger values-> Pass by Value -> Changes inside function  does not reflects/persists in main
        int notChangable = 5;

        //Arrays -> Pass by reference = Changes inside function reflects/persists in main
        int science[] = {99,98,93};
        updateScience(science,notChangable);

        System.out.println("Intger value = "+notChangable);

        for(int i = 0; i < science.length; i++){
            System.out.print(science[i]+" ");
        }




    }
}
