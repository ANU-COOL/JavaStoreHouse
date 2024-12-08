import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        float[] arr = new float[n];
        float sum = 0.0f;
        System.out.printf("Enter %d float values to be stored in the array:\n", n);
        for(int i = 0 ; i < n; i++){
            float element = sc.nextFloat();
            sum = sum + element;
        }
        System.out.printf("Sum of the elements in the array is %.3f\n", sum);

    }
}
