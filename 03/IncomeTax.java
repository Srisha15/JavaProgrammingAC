import java.util.*;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            System.out.println("No Tax");
            tax = 0;

        }
        else if(income >= 500000 && income <= 1000000){
            System.out.println("20% Tax");
            tax = (int)(income * 0.2);
            System.out.println(tax);
        }
        else{
            System.out.println("30% Tax");
            tax = (int)(income * 0.3);
            System.out.println(tax);
        }
    }
    
}
