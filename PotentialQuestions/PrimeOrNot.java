import java.util.*;
public class PrimeOrNot {
    public static boolean isPrime(int n){
        // boolean isPrime = true;

        if (n == 2){
            return true;
        }
        for(int i = 2; i <= n-1;i++){
            if(n%i == 0){ //completly dividing
                // isPrime = false;
                return false;
            }
        } 
                return true;
            }

    public static boolean optIsPrime(int n){
        if( n == 2){
            return true;
        }

        for(int i = 2; i<= Math.sqrt(n); i++){
            if( n% i == 0){
                return false;
            }
        }
            return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime number: "+ isPrime(n));
        sc.close();
    }
}
