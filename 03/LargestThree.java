import java.util.*;
public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("A is largest");
        }
        else if((b>=c)){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largerts");
        }
    }
    
}
