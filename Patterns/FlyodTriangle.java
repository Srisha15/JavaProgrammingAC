public class FlyodTriangle {
    public static void flyodTriangle(int n){
        int counter = 1;
        //outerloop - > No of lines
        for(int i = 1; i <= n ; i++){
            //innerloop -> Print counter
            for(int j = 1; j <= i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        flyodTriangle(5);
    }
    
}
