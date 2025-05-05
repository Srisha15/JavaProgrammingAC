//a
//bc
//def
//ghij


public class CharacterPyramid {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';
        for(int line= 1; line <=n;line++){
            for(int chars = 1; chars<=line;chars++){
                System.out.print(c);
                c++;
                
            }
            System.out.println();
        }
    }
}
