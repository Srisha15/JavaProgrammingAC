import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();  --> Captures till a space occurs, cant capture Sharma in Srisha Sharma
        String fullname = sc.nextLine(); //Captures a full line
        System.out.println("Your name is " + fullname);

        int numb = sc.nextInt(); //integer Input
        System.out.println("Your numb is " + numb);

        float price = sc.nextFloat();
        System.out.println("Your price is " + price);

        



    }
}
