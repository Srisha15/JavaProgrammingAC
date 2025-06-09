public class CapitalFirstChar {
    public static void getUpperCase(String str){

        StringBuilder sb = new StringBuilder("");

        //First letter should be capitalized
        char ch = Character.toUpperCase(str.charAt(0));
        
        //store ch in setbuilder
        sb.append(ch);

        //for loop to loop through the rest of string
        for(int i = 1; i < str.length(); i++){

            //after space character shoulfd be capitalized or after comma
            if((str.charAt(i) == ' ' ||str.charAt(i) == ',')&& i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);

    }
    public static void main(String[] args) {
        getUpperCase("i am srisha,hehe");
        
    }
}
