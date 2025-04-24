import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.565f;
        // int b = a; lossy conversion not supported via type conversion
        int b = (int) a;
        System.out.println(b);

        float marks = 99.999f;
        int marks2 = (int) marks;

        char ch = 's';
        int numb = ch;  //each characters have a number associated with it, so that gets assigned
        System.out.println(numb);


    }
}
