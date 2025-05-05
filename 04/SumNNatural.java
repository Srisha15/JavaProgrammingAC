import java.util.*;

public class SumNNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number to print sum of 1st n natiral numbers");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            sum += counter;
            counter ++;
        }
        System.out.println("Sum is "+ sum);
    }
    
}
