import java.util.*;

public class Functions {
//Functions inside class -> method
    public static void greet(){  //If function returns nothing--> return type = void
        System.out.println("Hello World");
        //return; return must be mentioned if the return type isnt void -> else throws error
    }

    public static int Sum(int a, int b){ //Parameters/Formal Parameters
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        int result = a + b;
        return result;
    }

    public static void Swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;

        System.out.println("Swapped values are: a ="+a+" and b="+b);
    }
    public static void main(String [] args){
        //function call = functionName();
        // greet();
        int num1 = 0, num2 = 0;
        System.out.println("Calling function...");
        // System.out.println("Result is "+Sum(num1,num2)); //Arguemnts

        //swap values
        int a = 5;
        int b = 10;
        Swap(a, b);
        System.out.println("a = "+a);   //Whatever changes you do to var a and b in swap arent refelcted in main -> Changes remian inj function = Call by value
        System.out.println("b = "+b);
        

       



    }
}
