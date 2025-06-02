public class Palindrome {
    public static void palindrome(String str){
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        if(revStr.equals(str)){
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome("Srisha");
        palindrome("noon");
        if(isPalindrome("racecar") == true){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
