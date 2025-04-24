public class TypePromotions {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        // char c = a - b; error -> lossy conversion a -b = int
        System.out.println((int) b);
        System.out.println((int)a);
        System.out.println(b); //No int --> Type promotions occurs only for expressions
        System.out.println(b-a); //Firts Converts b into int then a into int and then solves expression b-a
    }

}
