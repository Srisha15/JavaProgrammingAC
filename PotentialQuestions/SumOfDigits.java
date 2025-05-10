public class SumOfDigits {
    public static int CalcSum(int n){
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String [] args){
        System.out.println(CalcSum(11231));

    }
}
