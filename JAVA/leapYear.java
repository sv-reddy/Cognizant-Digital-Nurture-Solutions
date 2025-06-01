import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // check Leap Year 
        System.out.println("Check a year is leap year or not");
        int leapYear = sc.nextInt();
        boolean leap = false;
        if(leapYear % 4 == 0){
            leap =true;
            if(leapYear%100 == 0){
                leap=false;
                if(leapYear%400 == 0){
                    leap = true;
                }
            }
        }
        System.out.println(leapYear + (leap ? " is a leap year" : " is not a leap year"));
        sc.close();
    }
}
