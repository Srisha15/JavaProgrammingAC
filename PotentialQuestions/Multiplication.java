import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N");
        int n = sc.nextInt();
        System.out.println("Multiplcation table for "+ n+ " is:");
        for(int i =1; i <= 20; i++){
            System.out.print(i*n + " ");
        }
    }
}
