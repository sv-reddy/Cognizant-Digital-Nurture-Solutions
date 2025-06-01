public class methodOverloading {
    static public void add(int a, int b){
        System.out.println("Sum of "+ a + " & " + b + " is " + (a+b));
    }
    static public void add(double a, double b){
        System.out.println("Sum of "+ a + " & " + b + " is " + (a+b));
    }
    static public void add(int a, int b, int c){
        System.out.println("Sum of "+ a + ", " + b + " & " + c + " is " + (a+b));
    }
    public static void main(String[] args) {
        //Method OVerloading       
        methodOverloading.add(5,4);
        methodOverloading.add(6.5,9.8);
        methodOverloading.add(6,7,8);
    }
}
