//Display all numbers entered by user except multiples of 10
import java.util.*;
public class ContinueProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter number");
        // Scanner sc = new Scanner(System.in); Dont create Scanner in every loop -> Bad Practice
        int numb = sc.nextInt();
        if(numb%10 == 0){
            continue;
        }
        else{
            System.out.println("Your numver was "+numb);
        }
    }
        


    }
    
}
