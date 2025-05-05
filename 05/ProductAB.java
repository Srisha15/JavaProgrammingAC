import java.util.*;

public class ProductAB {

    public static float Product(float a, float b){
        float result = a * b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to Multiply");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float product = Product(num1, num2);
        System.out.println("Result is: "+product);
        sc.close();
    }
    
}
