import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius value");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of circle: "+area);
    }
}
