public class InvertedHalfPyramidNumb {
    public static void InvertedHalfPyramidNumb(int n){
        //outerloop - no of rows
        for(int i = 1; i <= n;i++){
            //innerloop - what to print
            for(int j = 1; j <= (n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedHalfPyramidNumb(5);
    }
}
