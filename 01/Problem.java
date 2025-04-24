import java.util.*;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter cost of eraser: ");
        float eraser = sc.nextFloat();
        // float price = pen * 0.18f +pencil* 0.18f +eraser*0.18f;
        float price = pen+pencil+eraser;
        float newPrice = price + (0.18f * price);
        System.out.println(newPrice);
    }
    
}
