public class InvertedStar {
    public static void main(String[] args) {
        
        //1.
        for(int line = 4; line > 0; line --){
            for(int star = 1; star <= line; star ++){
                System.out.print("*");
                
            }
            System.out.println();
        }

        //2.
        int n = 4;
        for(int line = 1; line <= 4; line++){
            for(int stars = 1; stars <= (n-line+1); stars++){   //Total stars = Total line - current line + 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
