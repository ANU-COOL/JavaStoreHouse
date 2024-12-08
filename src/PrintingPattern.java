import java.util.Scanner;

public class PrintingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines you want in the pattern: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
