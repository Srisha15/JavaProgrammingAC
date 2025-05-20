public class InvertedRotatedPyramid {
    public static void InvertedRotatedHalfPyramid(int n){
        //outerloop - > No of Rows
        for(int i = 1; i <= n; i++){
            //innerloop - > spaces
            for(int j = 1; j<= n - i; j++){
                System.out.print(" ");
            }
            //innerloop - > stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedRotatedHalfPyramid(4);
        
    }
}
