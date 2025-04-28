

public class TypesOperators {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        //airthemetic operatoe : 1. Binary
        System.out.println("add: " + (a+b));
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        //airthemtic operator: 2.Unary
        int x = 10;
        int y = x++;
        System.out.println(x);
         //a=a+1 => a++
         System.out.println(y);
         y = ++x;
         System.out.println(x);
         System.out.println(y);

    }
    
}
