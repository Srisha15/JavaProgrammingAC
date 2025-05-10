public class BinarytoDecimal {

    public static void binToDec(int bin){
        int mynum = bin;
        int pow = 0;
        int dec = 0;
        while(bin > 0){
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            bin = bin/10;

        }

        System.out.println("Binary number "+mynum+" is converted to decimal number "+dec);
    }
    public static void main(String [] main){
        binToDec(1001);

    }
}
