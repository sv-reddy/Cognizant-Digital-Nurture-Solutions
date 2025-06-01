public class String_Reversal {
    public static void main(String[] args) {
        //String Reversal
        String str = "Cognizant";
        StringBuilder str1 = new StringBuilder();
        for (char s : str.toCharArray()) {
            str1.append(s);
        }
        str1.reverse();
        System.out.println("The string reversal of " + str + " is " +str1);
        
    }
}
