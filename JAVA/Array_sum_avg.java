import java.util.Scanner;

public class Array_sum_avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array Sum and average
        System.out.println("Array Size:");
        int size = sc.nextInt();
        int sum =0;
        double avg;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();   
            sum += arr[i];
        }
        avg = (double)sum/(double)size;
        System.out.println("The sum of elements in array is " + sum);
        System.out.println("The average of elements in array is " + avg);
        sc.close();
    }
}