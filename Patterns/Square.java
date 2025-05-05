
public class Square {
    public static void main(String[] args){
        System.out.println("Using For Loop");
        for(int line = 1; line<=4;line++){
            System.out.println("* * * *");
        }
        System.out.println("Using While Loop");

        int lineCounter = 1;

        while(lineCounter <=4){
            System.out.println("* * * *");
            lineCounter++;
        }

    }
}
