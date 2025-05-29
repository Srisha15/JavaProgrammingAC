//Write a program that reads a set of integers,and then prints the sum of the even and odd integers
import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;
        int choice;
        do { 
            System.out.println("Enter number");
            int num = sc.nextInt();

            if(num%2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.println("Do you want to continue? Yes = 1, No = 0");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Odd Sum = "+oddSum);
        System.out.println("Even Sum = "+ evenSum);
        sc.close();
    }
}
