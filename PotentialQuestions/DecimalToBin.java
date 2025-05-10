public class DecimalToBin {
    public static void DectoBin(int dec){
        int binNum = 0;
        int pow = 0;
        while(dec > 0){
            int rem = dec % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("Binary Number = "+ binNum);
    }
    public static void main(String[] args){
        DectoBin(11);

    }
}
