import java.util.*;

public class Factorial {

    public static int CalcFact(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Factorial");
        int n = sc.nextInt();
        int result = CalcFact(n);
        System.out.println("Factorial is = "+ result);
        sc.close();
    }
    
}
