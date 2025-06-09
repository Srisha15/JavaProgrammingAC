public class ShortestPath {
    public static float  getShortestPath(String path){
        int x = 0; //x coordinate initially zero at origin
        int y = 0; //y coordinate initially zero at origin
        for(int i = 0; i < path.length(); i++){
            char dirname = path.charAt(i); //Store the current char of string inorder to compare

            if(dirname == 'N'){  //North y pt moves up
                y++;

            }
            else if(dirname == 'S'){  //South y coordinate moves down
                y--;

            }
            else if(dirname == 'E'){  //East x coordinate moves right positive direction
                x++;

            } else {
                x--; //West x coordinate moves left negative direction
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
