

public class FunctionOverloading {

    public static int sum(int a, int b){   //function sum
        return a+b;
    }

    public static int sum(int a, int b, int c){ //1. function overloading of sum using parameters
        return a+b+c;
    }

    public static float Mul(float a,float b){
        return a * b;
    }

    public static int Mul(int a,int b){ //2. Function overloading of Mul using datatypes 
        return a*b;

    }

    public static float Mul(int a,int b,float c){ 
        return a*b*c;

    }




    public static void main(String[] args) {
        
    }
    
}
