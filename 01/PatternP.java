public class PatternP {
    public static void Pattern1(){
        for (int i=0; i<5; i++){
            for (int j=0; j <=i; j++){
                System.out.print("* ");
            }
            if(i != 4){
                
                System.out.println();
            } 
        }


    }

    public static void Pattern2(){
        for (int i=5; i>=1; i--){
            for (int j=1; j <=i; j++){
                System.out.print("* ");
            }
            if(i != 0){
                
                System.out.println();
            } 
        }

    }
    public static void main(String[] args) {
       Pattern2();
    }
}
