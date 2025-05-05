public class StarPattern {
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line++){ //No of lines
            for(int star = 1; star <= line; star ++){  //in ith line -> i no of *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
