public class HollowRectangle {
    public static void HollowRectangle(int totRows, int totCol){
        //outer loop - > How many rows/lines
        for(int i = 1; i <= totRows; i++){
            //inner loop -> Columns
            for(int j = 1; j<= totCol; j++){
                //Locate the cell where the * is to be present
                if(i == 1|| i == totRows || j == 1 || j == totCol){
                    System.out.print("*");
                } else{
                    System.out.print(" ");

                }
            }
                System.out.println();
            
        }
    }
    public static void main(String [] args){
        HollowRectangle(4, 5);

    }
}
