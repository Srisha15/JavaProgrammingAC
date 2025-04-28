import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("a is bigger than b");
        }
        else{
            System.out.println("b is largest");
        }
    }
    
}
