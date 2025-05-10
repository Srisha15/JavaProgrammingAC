public class Palindrome {

    public static void Palindrome(int n){
        int reverse = 0;
        int original = n;
        while(n > 0){

            int rem = n % 10; //last digit extract
            reverse = (reverse * 10) + rem; 
            n = n/10; //remove last digit
        }

        if(reverse == original){
            System.out.println("The number is a Palindrome");

        }else{
            System.out.println("The number isnt a Palindrome");
        }
            
    }
    public static void main(String [] args){
        Palindrome(121);
        Palindrome(456);
    }
}
