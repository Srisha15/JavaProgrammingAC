import java.util.*;

public class TernaryOp {
    public static void main(String[] args) {
        int num = 5;
        String result = (num%2 == 0)?"Even":"Odd";
        //Datatype var_name = (cond)?"True stat":"False Stat"
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status = (marks >= 33)?"Pass":"Fail";
        System.out.println(status);
        sc.close();

    }
    
}
