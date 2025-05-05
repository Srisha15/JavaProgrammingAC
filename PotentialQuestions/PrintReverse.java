

public class PrintReverse {
    public static void main(String[] args) {
        int n = 210801;
        while(n>0){
            //1.Get the last digit
            int lastDigit = n % 10;
            //2.Print
            System.out.print(lastDigit);
            //3.Remove the last Digit from n
            n = n/10;
        }

    
    }
}
