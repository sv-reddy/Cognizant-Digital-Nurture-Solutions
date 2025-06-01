public class operatorPrecedence {
    public static void main(String[] args) {      
        //Opeartor Precedence
        int result1 = 5 * 9 + 15 - 9 / 2; // *, / and %  has high precedence in the left to right
        int result2 = 5 * (9 + 15) - 9 / 2; // parantheses has high predence than any other operator
        int result3 = 5 * 9 + (15 - 9) / 2; 
        boolean logicResult = true || false && true; // && has higher precedence than ||
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(logicResult); 
        
    }
}
