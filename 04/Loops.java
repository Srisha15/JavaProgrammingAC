import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int n = sc.nextInt();

        int counter = 1;
        while(counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
    }
}
