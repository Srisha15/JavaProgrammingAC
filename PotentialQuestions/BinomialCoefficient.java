import java.util.*;

public class BinomialCoefficient {

    public static int calFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n,int r){
        int nfact = calFactorial(n);
        int rfact = calFactorial(r);
        int nmrfact = calFactorial(n-r);
        int result = nfact/(rfact*nmrfact);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = binCoeff(n, r);
        System.out.println("Result is = "+ result);
    }
}
